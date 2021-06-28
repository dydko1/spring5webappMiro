package guru.springframework.oneToMany;

import guru.springframework.oneToMany.model.Comment;
import guru.springframework.oneToMany.model.Post;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class JpaOneToManyDemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(JpaOneToManyDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		/*
		// Create a Post
		Post post = new Post("post title", "post description", "post content");

		// Create Comments
		Comment comment1 = new Comment("Great Post!");
		comment1.setPost(post);
		Comment comment2 = new Comment("Really helpful Post. Thanks a lot!");
		comment2.setPost(post);
	*/
	}
}
