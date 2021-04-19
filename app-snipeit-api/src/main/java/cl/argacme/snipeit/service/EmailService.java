package cl.argacme.snipeit.service;

import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import javax.mail.Message;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.stereotype.Service;

import cl.argacme.snipeit.model.Checkout;
import cl.argacme.snipeit.model.Email;

@Service
public class EmailService {
    @Autowired
    private JavaMailSender mailSender;
     
    @Autowired
    private SimpleMailMessage preConfiguredMessage;
 
    /**
     * This method will send compose and send the message 
     * */
    public void sendMail(Email dto) 
    {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(dto.getTo());
        message.setSubject(dto.getSubject());
        message.setText(dto.getBody());
        mailSender.send(message);
    }
 
    public void sendMailMachine(Checkout checkout) 
    {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo("snipeit@servipag.cl");
        message.setSubject("INFO MAQUINA");
        message.setText("La maquina '" + checkout.getMachine().toUpperCase() + "', NO tiene asociada ninguna de las siguientes MAC address en <b>SERVIPAG</b>: \n"
        		+ "" + Arrays.toString(checkout.getMacaddress()));
        mailSender.send(message);
    }
    
    public void sendMailInfo(HashMap<String, Object> map) 
    {
        SimpleMailMessage message = new SimpleMailMessage();
        Checkout checkout = (Checkout)map.get("checkout");
        List<String> listLicense = (List<String>)map.get("software");
		List<String> listNoLicense = (List<String>)map.get("NoSoftware");
        message.setTo("snipeit@servipag.cl");
        message.setSubject("INFO MAQUINA");
        message.setText("La maquina '" + checkout.getMachine().toUpperCase() + "', tiene asociada la siguiente MAC address: \n"
        		+ "" + Arrays.toString(checkout.getMacaddress()) + "\n"
        		+ "\n"
        		+ "Esta es la lista de software instalado, pero <b>NO AUTORIZADO</b> en la maquina: \n"
        		+ listLicense + "\n"
        		+ "\n"
        		+ "Esta es la lista de software instalado en la maquina, <b>NO REGISTRADO EN SERVIPAG</b> : \n"
        		+ listNoLicense + "\n"
        		+ "\n");
        
        
        mailSender.send(message);
    }
    
    
    /**
     * This method will send a pre-configured message
     * */
    public void sendPreConfiguredMail(Email dto) 
    {
        SimpleMailMessage mailMessage = new SimpleMailMessage(preConfiguredMessage);
        mailMessage.setText(dto.getMessage());
        mailSender.send(mailMessage);
    }
    
    public void sendMailWithAttachment(Email dto, String fileToAttach) 
    {
    	MimeMessagePreparator preparator = new MimeMessagePreparator() 
    	{
            public void prepare(MimeMessage mimeMessage) throws Exception 
            {
                mimeMessage.setRecipient(Message.RecipientType.TO, new InternetAddress(dto.getTo()));
                mimeMessage.setFrom(new InternetAddress("admin@gmail.com"));
                mimeMessage.setSubject(dto.getSubject());
                mimeMessage.setText(dto.getBody());
                
                FileSystemResource file = new FileSystemResource(new File(fileToAttach));
                MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);
                helper.addAttachment("logo.jpg", file);
            }
        };
        
        try {
            mailSender.send(preparator);
        }
        catch (MailException ex) {
            // simply log it and go on...
            System.err.println(ex.getMessage());
        }
    }
    
    public void sendMailWithInlineResources(Email dto, String fileToAttach) 
    {
    	MimeMessagePreparator preparator = new MimeMessagePreparator() 
    	{
            public void prepare(MimeMessage mimeMessage) throws Exception 
            {
                mimeMessage.setRecipient(Message.RecipientType.TO, new InternetAddress(dto.getTo()));
                mimeMessage.setFrom(new InternetAddress("noreply-servipag@servipag.cl"));
                mimeMessage.setSubject(dto.getSubject());
                mimeMessage.setText(dto.getBody());
                
                MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);
                
                helper.setText("<html><body><img src='cid:identifier1234'></body></html>", true);
                
                FileSystemResource res = new FileSystemResource(new File(fileToAttach));
                helper.addInline("identifier1234", res);
            }
        };
        
        try {
            mailSender.send(preparator);
        }
        catch (MailException ex) {
            // simply log it and go on...
            System.err.println(ex.getMessage());
        }
    }
}
