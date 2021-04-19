package cl.argacme.snipeit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import cl.argacme.snipeit.model.Users;

public interface UsersRepository extends JpaRepository<Users, Integer>{
}
