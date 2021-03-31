package guru.springframework.spring5webapp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication

public class Spring5webappApplication {

	public static void main(String[] args) {
		//ConfigurableApplicationContext context
		SpringApplication.run(Spring5webappApplication.class, args);
	}
}
