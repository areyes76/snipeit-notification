package cl.argacme.snipeit.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.argacme.snipeit.repository.AssetsRepository;

@RestController
@RequestMapping("/api")
public class TestController extends AbstractController{
	private final Logger log = LoggerFactory.getLogger(TestController.class);
	
	
	public TestController(AssetsRepository assetsRepository) {
		this.assetsRepository = assetsRepository;
	}

    @GetMapping("/test")
    String asset() {
    	log.info("BUSCANDO TODOS.....");
    	if( assetsRepository.findAll()!=null)
    		return "OK";
        return "NOK";
    }

}
