package cl.argacme.snipeit.web;

import java.util.Collection;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.argacme.snipeit.model.Users;
import cl.argacme.snipeit.repository.UsersRepository;

@RestController
@RequestMapping("/api")
public class UsersController extends AbstractController{
	private final Logger log = LoggerFactory.getLogger(UsersController.class);
	
	
	public UsersController(UsersRepository usersRepository) {
		this.usersRepository = usersRepository;
	}

    @GetMapping("/users")
    Collection<Users> users() {
    	log.info("BUSCANDO TODOS.....");
        return usersRepository.findAll();
    }
    
    @GetMapping("/users/{id}")
    ResponseEntity<?> getGroup(@PathVariable Integer id) {
    	log.info("BUSCANDO USER: " + id);
        Optional<Users> user = usersRepository.findById(id);
        return user.map(response -> ResponseEntity.ok().body(response))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    
	
}
