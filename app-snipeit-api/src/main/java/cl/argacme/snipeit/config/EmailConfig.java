package cl.argacme.snipeit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.SimpleMailMessage;

@Configuration
public class EmailConfig {
	@Bean
	public SimpleMailMessage emailTemplate()
	{
		SimpleMailMessage message = new SimpleMailMessage();
		message.setTo("snipeit@.com");
		message.setFrom("noreply-argacme@.com);
		message.setSubject("Importante email");
	    message.setText("FATAL: bloqueo de la aplicación. ¡Guarde su trabajo!");
	    return message;
	}
}
