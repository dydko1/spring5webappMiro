package guru.springframework.oneToMany;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
public class JpaOneToManyApplication {
	private static final String PERSISTENCE_UNIT_NAME = "my-pu";

	public static void main(String[] args) {
		SpringApplication.run(JpaOneToManyApplication.class, args);

	}

	@Bean
	public CommandLineRunner mappingDemo() {
		return args -> {

		};
	}
}
