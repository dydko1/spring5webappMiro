package guru.springframework.oneToMany;

import guru.springframework.oneToMany.model.Book;
import guru.springframework.oneToMany.model.Page;
import guru.springframework.oneToMany.repository.BookRepository;
import guru.springframework.oneToMany.repository.PageRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
public class JpaOneToManyDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaOneToManyDemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner mappingDemo(BookRepository bookRepository, PageRepository pageRepository) {
		return args -> {
			Book book = new Book("Java 101", "John Doe", "123456");

			bookRepository.save(book);

			pageRepository.save(new Page(1, "Introduction contents", "Introduction", book));
			pageRepository.save(new Page(65, "Java 8 contents", "Java 8", book));
			pageRepository.save(new Page(95, "Concurrency contents", "Concurrency", book));
		};
	}
}
