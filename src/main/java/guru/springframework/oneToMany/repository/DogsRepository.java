package guru.springframework.oneToMany.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DogsRepository extends CrudRepository<Dog, Long> {}