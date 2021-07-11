package guru.springframework.oneToMany.service;

import guru.springframework.oneToMany.exception.StudentNotFoundException;
import guru.springframework.oneToMany.model.Student;
import guru.springframework.oneToMany.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.hibernate.query.criteria.internal.predicate.IsEmptyPredicate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.validation.constraints.Null;
import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {
    //@Autowired
    private final StudentRepository studentRepository;

    public void add(Student student) {
        studentRepository.save(student);
    }

    public void update(Long id, Student student) {
        Student student1 = new Student();
        student1.setStudent_id(id);
        student1.setFirstName(student.getFirstName());
        student1.setLastName(student.getLastName());
        student1.setYear(student.getYear());
        studentRepository.save(student1);
    }

    public void delete(Long id) {
        studentRepository.deleteById(id);
    }

    public Student getStudent(Long id) {
        return studentRepository.findById(id).orElseThrow(StudentNotFoundException::new);
    }

    public List<Student> getAllStudent() {
            return studentRepository.findAll();
    }
}
