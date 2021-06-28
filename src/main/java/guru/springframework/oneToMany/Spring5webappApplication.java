package guru.springframework.oneToMany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.util.Calendar;

@SpringBootApplication
@EnableJpaAuditing
public class Spring5webappApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Spring5webappApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}
}
