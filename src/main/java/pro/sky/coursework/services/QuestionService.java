package pro.sky.coursework.services;

import pro.sky.coursework.domains.Question;

import java.util.Collection;
import java.util.List;

public interface QuestionService {
    Question add(String question, String answer);

    Question remove(String question, String answer);

    Question add(Question question);

    Question remove(Question question);

    Boolean contains(Question question);

    Collection<Question> getAll();

    List<Integer> getRandomList(Integer amount);

    List<Question> getQuestionList(List<Integer> questionNumberList);
}
