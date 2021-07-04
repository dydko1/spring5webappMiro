package guru.springframework.oneToMany;

import guru.springframework.oneToMany.model.Address;
import guru.springframework.oneToMany.model.User;
import guru.springframework.oneToMany.repository.AddressRepository;
import guru.springframework.oneToMany.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpaOneToManyDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaOneToManyDemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner mappingDemo(UserRepository userRepository) {
		return args -> {

			// create a user instance
			User user = new User("John Doe", "john.doe@example.com", "1234abcd");

			// create an address instance
			Address address = new Address("Lake View 321", "Berlin", "Berlin",
					"95781", "DE");

			// set child reference
			address.setUser(user);

			// set parent reference
			user.setAddress(address);

			// save the parent
			// which will save the child (address) as well
			userRepository.save(user);

			// -------------------
			// create a user instance
			user = new User("John Doe2", "john.doe@example.com2", "1234abcd2");

			// create an address instance
			address = new Address("Lake View 3212", "Berlin2", "Berlin2",
					"957812", "DE2");

			// set child reference
			address.setUser(user);

			// set parent reference
			user.setAddress(address);

			// save the parent
			// which will save the child (address) as well
			userRepository.save(user);
		};
	}
}
