package pro.sky.coursework.domains;

import java.util.Objects;

public class QuestionImpl implements Question {
    private final String question;
    private final String answer;

    public QuestionImpl(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    public boolean equals(Object object) {
        return (this == object ||
                object != null &&
                        getClass() == object.getClass() &&
                        Objects.equals(question, ((Question) object).getQuestion())) &&
                        Objects.equals(answer, ((Question) object).getAnswer());
    }

    public int hashCode() {
        return Objects.hash(question, answer);
    }
}
