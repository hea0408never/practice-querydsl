package study.querydsl.practice;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Long>, CustomBookRepository {
}
