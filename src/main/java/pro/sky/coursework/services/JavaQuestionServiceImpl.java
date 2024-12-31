package pro.sky.coursework.services;

import org.springframework.stereotype.Service;
import pro.sky.coursework.domains.Question;
import pro.sky.coursework.domains.QuestionImpl;
import pro.sky.coursework.exceptions.IncorrectQuestionNumberException;
import pro.sky.coursework.exceptions.QuestionAlreadyExistsException;
import pro.sky.coursework.exceptions.QuestionNotFoundException;

import java.util.*;

@Service
public class JavaQuestionServiceImpl implements QuestionService {
    private final Set<Question> questions = new HashSet<>();
    private final Random randomNumbers = new Random();

    public Question add(String question, String answer) {
        return add(new QuestionImpl(question, answer));
    }

    public Question remove(String question, String answer) {
        return remove(new QuestionImpl(question, answer));
    }

    public Question add(Question question) {
        if (questions.contains(question)) {
            throw new QuestionAlreadyExistsException();
        }
        questions.add(question);
        return question;
    }

    public Question remove(Question question) {
        if (!questions.contains(question)) {
            throw new QuestionNotFoundException();
        }
        questions.remove(question);
        return question;
    }

    public Boolean contains(Question question) {
        return questions.contains(question);
    }

    public Collection<Question> getAll() {
        return questions;
    }

    public List<Integer> getRandomList(Integer amount) {
        if (amount <= 0 || amount > questions.size()) {
            throw new IncorrectQuestionNumberException();
        }
        List<Integer> result = new ArrayList<>();
        // How to convert imperative cycle below into a stream API expression?
        for (int i = 0; i < amount; i++) {
            result.add(randomNumbers.nextInt(amount));
        }
        return result;
    }

    public List<Question> getQuestionList(List<Integer> questionNumberList) {
        List<Question> resultQuestionList = new ArrayList<>();
        questionNumberList.forEach(i -> resultQuestionList.add(questions.stream().toList().get(i)));
        return resultQuestionList;
    }
}
