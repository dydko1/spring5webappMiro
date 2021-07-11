package guru.springframework.oneToMany.repository;

import guru.springframework.oneToMany.model.Dog;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DogsRepository extends CrudRepository<Dog, Long> {}