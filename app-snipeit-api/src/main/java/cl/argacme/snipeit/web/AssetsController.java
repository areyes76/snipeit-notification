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

import cl.argacme.snipeit.model.Assets;
import cl.argacme.snipeit.repository.AssetsRepository;

@RestController
@RequestMapping("/api")
public class AssetsController extends AbstractController{
	private final Logger log = LoggerFactory.getLogger(AssetsController.class);
	
	
	public AssetsController(AssetsRepository assetsRepository) {
		this.assetsRepository = assetsRepository;
	}

    @GetMapping("/assets")
    Collection<Assets> asset() {
    	log.info("BUSCANDO TODOS.....");
        return assetsRepository.findAll();
    }
    
    @GetMapping("/assets/{id}")
    ResponseEntity<?> getAssets(@PathVariable Integer id) {
    	log.info("BUSCANDO USER: " + id);
        Optional<Assets> asset = assetsRepository.findById(id);
        return asset.map(response -> ResponseEntity.ok().body(response))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    
    @PostMapping("/assets")
    ResponseEntity<Assets> createAsset(@Validated @RequestBody Assets asset) throws URISyntaxException {
        log.info("Request para crear license: {}", asset);
        Assets result = assetsRepository.saveAndFlush(asset);
        return ResponseEntity.created(new URI("/api/assets/" + result.getId()))
                .body(result);
    }
}
