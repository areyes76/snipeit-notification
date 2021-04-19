package cl.argacme.snipeit.web;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.Optional;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.argacme.snipeit.model.Licenses;
import cl.argacme.snipeit.repository.LicensesRepository;

@RestController
@RequestMapping("/api")
public class LicensesController extends AbstractController{
	private final Logger log = LoggerFactory.getLogger(LicensesController.class);
	
	
	public LicensesController(LicensesRepository licensesRepository) {
		this.licensesRepository = licensesRepository;
	}

    @GetMapping("/licenses")
    Collection<Licenses> license() {
    	log.info("BUSCANDO TODOS.....");
        return licensesRepository.findAll();
    }
    
    @GetMapping("/licenses/{id}")
    ResponseEntity<?> getLicenses(@PathVariable Integer id) {
    	log.info("BUSCANDO USER: " + id);
        Optional<Licenses> license = licensesRepository.findById(id);
        return license.map(response -> ResponseEntity.ok().body(response))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    
    @PostMapping("/licenses")
    ResponseEntity<Licenses> createlicense(@Validated @RequestBody Licenses license) throws URISyntaxException {
        log.info("Request para crear license: {}", license);
        Licenses result = licensesRepository.saveAndFlush(license);
        return ResponseEntity.created(new URI("/api/licenses/" + result.getId()))
                .body(result);
    }
}
