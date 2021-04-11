package guru.springframework.spring5webapp;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

//public interface CustomerRepo extends CrudRepository<Customers, Long> {
@RepositoryRestResource(collectionResourceRel="customers", path="customers")
public interface CustomerRepo extends JpaRepository<Customers, Long> {

}
