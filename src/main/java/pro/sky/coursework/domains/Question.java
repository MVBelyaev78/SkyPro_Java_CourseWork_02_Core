package pro.sky.coursework.domains;

public interface Question {
    String question();

    String answer();

    boolean equals(Object object);

    int hashCode();

    static Question copyOf(Question question) {
        return new QuestionImpl(question.question(), question.answer());
    }
}
