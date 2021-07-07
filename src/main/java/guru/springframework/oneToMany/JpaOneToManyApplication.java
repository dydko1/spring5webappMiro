package guru.springframework.oneToMany;

import guru.springframework.oneToMany.model.Employee;
import guru.springframework.oneToMany.repository.EmployeeRepository;
import guru.springframework.oneToMany.repository.EmployeeRepositoryImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.util.Arrays;

@SpringBootApplication

public class JpaOneToManyApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaOneToManyApplication.class, args);
	}

	@Bean
	public CommandLineRunner mappingDemo(EmployeeRepository employeeRepository) {
		return args -> {
			Employee employee = new Employee("Miroslaw", "Dyduch", "miroslaw.dyduch@gmial.com", 40, 45);
			employeeRepository.save(employee);
		};
	}
}
