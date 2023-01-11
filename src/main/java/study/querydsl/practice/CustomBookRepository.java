package study.querydsl.practice;

public interface CustomBookRepository {
    BookPatchDto getBook(Long id);
}
