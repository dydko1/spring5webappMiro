package guru.springframework.oneToMany.repository;

import guru.springframework.oneToMany.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {

    Book findByIsbn(String isbn);
}