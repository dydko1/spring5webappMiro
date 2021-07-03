package guru.springframework.oneToMany;


import guru.springframework.oneToMany.model.Course;
import guru.springframework.oneToMany.model.Student;
import guru.springframework.oneToMany.repository.CourseRepository;
import guru.springframework.oneToMany.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class JpaManyToManyDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaManyToManyDemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner mappingDemo(StudentRepository studentRepository,
										 CourseRepository courseRepository) {
		return args -> {

			// create a student
			Student student = new Student("John Doe", 15, "8th");
			// save the student
			studentRepository.save(student);
			// create three courses
			Course course1 = new Course("Machine Learning", "ML", 12, 1500);
			Course course2 = new Course("Database Systems", "DS", 8, 800);
			Course course3 = new Course("Web Basics", "WB", 10, 0);
			// save courses
			courseRepository.saveAll(Arrays.asList(course1, course2, course3));
			// add courses to the student
			student.getCourses().addAll(Arrays.asList(course1, course2, course3));
			// update the student
			studentRepository.save(student);

			// ------------------
			// create a student2
			Student student2 = new Student("John Doe", 15, "8th");
			// save the student
			studentRepository.save(student2);
			// create three courses
			Course course10 = new Course("Machine Learning", "ML", 12, 1500);
			Course course20 = new Course("Database Systems", "DS", 8, 800);
			Course course30 = new Course("Web Basics", "WB", 10, 0);
			// save courses
			courseRepository.saveAll(Arrays.asList(course10, course20, course30));
			// add courses to the student
			student2.getCourses().addAll(Arrays.asList(course10, course20, course30));
			// update the student
			studentRepository.save(student2);

			// create a student
			Student student3 = new Student("John Doe3", 153, "83th");
			Student student4 = new Student("John Doe4", 154, "84th");
			// save the student
			studentRepository.save(student3);
			studentRepository.save(student4);
			// create three courses
			//Course course1 = new Course("Machine Learning", "ML", 12, 1500);
			//Course course2 = new Course("Database Systems", "DS", 8, 800);
			//Course course3 = new Course("Web Basics", "WB", 10, 0);
			// save courses
			//courseRepository.saveAll(Arrays.asList(course1, course2, course3));
			// add courses to the student
			student3.getCourses().addAll(Arrays.asList(course1, course2));
			student4.getCourses().addAll(Arrays.asList(course2, course3));
			// update the student
			studentRepository.save(student3);
			studentRepository.save(student4);
		};
	}
}
