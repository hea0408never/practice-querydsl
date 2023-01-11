package study.querydsl.practice;

import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

import static study.querydsl.practice.QBook.book;

@Repository
@Transactional(readOnly = true)
public class CustomBookRepositoryImpl implements CustomBookRepository{

    private final JPAQueryFactory queryFactory;

    public CustomBookRepositoryImpl(EntityManager em) {
        this.queryFactory = new JPAQueryFactory(em);
    }

    @Override
    public BookPatchDto getBook(Long id){
        return queryFactory
                .select(Projections.fields(BookPatchDto.class,
                        book.id,
                        book.name,
                        book.isbn,
                        book.writer,
                        book.type))
                .from(book)
                .where(book.id.eq(id))
                .fetchFirst();
    }
}
