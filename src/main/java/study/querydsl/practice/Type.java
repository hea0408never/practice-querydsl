package study.querydsl.practice;

public enum Type {
    IT("it"),
    HUMANITIES("인문"),
    SELF_DEVELOPMENT("자기계발"),
    NOVEL("소설");

    private final String value;

    Type(String value){this.value = value;}


}
