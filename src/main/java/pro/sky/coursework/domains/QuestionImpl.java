package pro.sky.coursework.domains;

import java.util.Objects;

public record QuestionImpl(String question, String answer) implements Question {

    public boolean equals(Object object) {
        return (this == object ||
                object != null &&
                        getClass() == object.getClass() &&
                        Objects.equals(question, ((Question) object).question())) &&
                Objects.equals(answer, ((Question) object).answer());
    }

}
