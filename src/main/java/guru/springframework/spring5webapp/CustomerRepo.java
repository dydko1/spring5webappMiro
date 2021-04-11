package guru.springframework.spring5webapp;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//public interface CustomerRepo extends CrudRepository<Customers, Long> {
@Repository
public interface CustomerRepo extends JpaRepository<Customers, Long> {

}
