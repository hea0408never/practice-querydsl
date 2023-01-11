package study.querydsl.practice;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BookService {
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Book post(BookPostDto dto){
        Book book = new Book();
        book.setName(dto.getName());
        book.setIsbn(dto.getIsbn());
        book.setWriter(dto.getWriter());
        book.setType(dto.getType());
        return bookRepository.save(book);

    }

    public Book patch(BookPatchDto dto) {
        Book book = findBook(dto.getId());
        book.setName(dto.getName());
        book.setIsbn(dto.getIsbn());
        book.setWriter(dto.getWriter());
        book.setType(dto.getType());
        return bookRepository.save(book);
    }

    private Book findBook(Long id) {
        return bookRepository.findById(id).orElseThrow(()-> new RuntimeException("없"));
    }

    public void delete(long id) {
        Book book = findBook(id);
        bookRepository.delete(book);
    }

    public BookPatchDto findBookById(Long id){
        return bookRepository.getBook(id);
    }
}
