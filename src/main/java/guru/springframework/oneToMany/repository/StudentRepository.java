package guru.springframework.oneToMany.repository;

import guru.springframework.oneToMany.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
