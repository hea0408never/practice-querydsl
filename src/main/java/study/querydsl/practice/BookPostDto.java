package study.querydsl.practice;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookPostDto {
    private String name;
    private String isbn;
    private String writer;
    private Type type;
}
