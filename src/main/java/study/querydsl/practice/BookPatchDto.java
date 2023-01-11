package study.querydsl.practice;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class BookPatchDto {
    private Long id;

    private String name;
    private String isbn;
    private String writer;
    private Type type;

    public BookPatchDto(String name, String isbn, String writer, Type type) {
        this.name = name;
        this.isbn = isbn;
        this.writer = writer;
        this.type = type;
    }
}
