package pro.sky.coursework.domains;

public interface Question {
    String getQuestion();

    String getAnswer();

    boolean equals(Object object);

    int hashCode();

    static Question copyOf(Question question) {
        return new QuestionImpl(question.getQuestion(), question.getAnswer());
    }
}
