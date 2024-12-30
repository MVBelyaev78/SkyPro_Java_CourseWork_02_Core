package pro.sky.coursework.exceptions;

public class QuestionNotFoundException extends IllegalArgumentException {
    public String getMessage() {
        return "Question not found";
    }
}
