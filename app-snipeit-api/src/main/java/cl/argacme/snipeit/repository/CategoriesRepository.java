package cl.argacme.snipeit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import cl.argacme.snipeit.model.Categories;

public interface CategoriesRepository extends JpaRepository<Categories, Integer>{
}
