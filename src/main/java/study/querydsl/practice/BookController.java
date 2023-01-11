package study.querydsl.practice;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/book")
public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService){
        this.bookService=bookService;
    }

    @PostMapping("/post")
    public ResponseEntity<BookPostDto> post(@RequestBody BookPostDto dto){
        Book book = bookService.post(dto);
        return ResponseEntity.ok(dto);
    }

    @PatchMapping("/patch")
    public ResponseEntity<BookPatchDto> patch(@RequestBody BookPatchDto dto){
        Book book = bookService.patch(dto);
        return ResponseEntity.ok(dto);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<String> delete(@RequestParam long id){
        bookService.delete(id);
        return ResponseEntity.ok("deleted");
    }

    @GetMapping
    public ResponseEntity<BookPatchDto> getBook(@RequestParam long id){
        BookPatchDto bookPatchDto = bookService.findBookById(id);
        return ResponseEntity.ok(bookPatchDto);
    }
}
