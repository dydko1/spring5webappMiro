package guru.springframework.oneToMany.repository;

import guru.springframework.oneToMany.model.Dog;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DogsRepositoryWildcardWithQueryMethods extends CrudRepository<Dog, Long> {

    List<Dog> findByNameContaining(String name);

    List<Dog> findByNameNotContaining(String name);

    List<Dog> findByNameStartsWith(String name);

    List<Dog> findByNameEndsWith(String name);
}