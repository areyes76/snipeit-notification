package cl.argacme.snipeit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.argacme.snipeit.model.Assets;

@Repository
public interface AssetsRepository extends JpaRepository<Assets, Integer>{
	Assets findByName(String name);
	Assets findBySnipeitMacAddress1(String macAddress);
}
