package pro.sky.coursework.exceptions;

public class IncorrectQuestionNumberException extends IllegalArgumentException {
    public String getMessage() {
        return "Number of question is incorrect";
    }
}
