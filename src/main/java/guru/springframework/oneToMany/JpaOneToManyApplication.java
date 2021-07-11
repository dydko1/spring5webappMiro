package guru.springframework.oneToMany;

import guru.springframework.oneToMany.model.Student;
import guru.springframework.oneToMany.service.StudentService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.util.Arrays;

@SpringBootApplication
@EnableJpaAuditing
public class JpaOneToManyApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaOneToManyApplication.class, args);
	}

	@Bean
	public CommandLineRunner mappingDemo(StudentService studentService) {
		return args -> {
			Student student = new Student();
			student.setFirstName("Miroslaw");
			student.setLastName("Dyduch");
			student.setYear(1981);
			
			studentService.add(student);
		};
	}
}
