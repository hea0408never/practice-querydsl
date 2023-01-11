package study.querydsl.practice;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Book {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String isbn;
    private String writer;
    private Type type;

    public Book() {
    }

    public Book(Long id, String name, String isbn, String writer, Type type) {
        this.id = id;
        this.name = name;
        this.isbn = isbn;
        this.writer = writer;
        this.type = type;
    }

    public Book(String name, String isbn, String writer, Type type) {
        this.name = name;
        this.isbn = isbn;
        this.writer = writer;
        this.type = type;
    }
}
