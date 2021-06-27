package guru.springframework.spring5webapp.repository;

import guru.springframework.spring5webapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by rajeevkumarsingh on 20/11/17.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}