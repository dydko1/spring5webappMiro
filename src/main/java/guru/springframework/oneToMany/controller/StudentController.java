package guru.springframework.oneToMany.controller;

import guru.springframework.oneToMany.model.Student;
import guru.springframework.oneToMany.repository.StudentRepository;
import guru.springframework.oneToMany.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/students")
public class StudentController {
    // @Autowired
    private final StudentService studentService;

    @PostMapping
    public void postStudent(@RequestBody Student student) {
        studentService.add(student);
    }

    @PutMapping
    public void putStudent(@RequestParam Long id, @RequestBody Student student) {
        studentService.update(id, student);
    }

    @DeleteMapping
    public void deleteStudent(@RequestParam Long id) {
        studentService.delete(id);
    }

    @RequestMapping(method = RequestMethod.GET)
    public Student getStudent(@RequestParam Long id) {
        return studentService.getStudent(id);
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Student> getAllStudent() {
        return studentService.getAllStudent();
    }
}
