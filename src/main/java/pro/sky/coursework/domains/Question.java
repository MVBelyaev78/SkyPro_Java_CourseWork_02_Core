package pro.sky.coursework.domains;

import java.util.Objects;

public record Question(String question, String answer) {

    public boolean equals(Object object) {
        return (this == object ||
                object != null &&
                        getClass() == object.getClass() &&
                        Objects.equals(question, ((Question) object).question())) &&
                        Objects.equals(answer, ((Question) object).answer());
    }

    static Question copyOf(Question question) {
        return new Question(question.question(), question.answer());
    }
}
