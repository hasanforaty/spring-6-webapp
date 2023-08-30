package guru.springframework.spring6webapp.repositories;

import guru.springframework.spring6webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;


/**
 * Spring data :
 *      CrudeRepository will create basic Crud Operation for Entity with given id Type
 */
public interface AuthorRepository extends CrudRepository<Author,Long> {


}
