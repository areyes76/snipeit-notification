package cl.argacme.snipeit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import cl.argacme.snipeit.model.Models;

public interface ModelsRepository extends JpaRepository<Models, Integer>{
}
