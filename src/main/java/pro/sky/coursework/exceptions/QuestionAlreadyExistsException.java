package pro.sky.coursework.exceptions;

public class QuestionAlreadyExistsException extends IllegalArgumentException {
    public String getMessage() {
        return "Question already exists";
    }
}
