package cl.argacme.snipeit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import cl.argacme.snipeit.model.Licenses;

public interface LicensesRepository extends JpaRepository<Licenses, Integer>{
	Licenses findByName(String name);
}
