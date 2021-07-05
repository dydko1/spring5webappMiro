package guru.springframework.oneToMany;

import guru.springframework.oneToMany.model.Comment;
import guru.springframework.oneToMany.model.Post;
import guru.springframework.oneToMany.repository.CommentRepository;
import guru.springframework.oneToMany.repository.PostRepository;
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
	public CommandLineRunner mappingDemo(PostRepository postRepository, CommentRepository commentRepository) {
		return args -> {
			Post post = new Post("Title11", "Post 11 description", "Post11 content");
			postRepository.save(post);

			// save comments
			commentRepository.save(new Comment("Comment 1111",post));
			commentRepository.save(new Comment("Comment 2222",post));
			commentRepository.save(new Comment("Comment 2222",post));
		};
	}
}
