package guru.springframework.oneToMany.repository;

import guru.springframework.oneToMany.model.Book;
import guru.springframework.oneToMany.model.Page;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PageRepository extends CrudRepository<Page, Long> {
    List<Page> findByBook(Book book, Sort sort);
}
