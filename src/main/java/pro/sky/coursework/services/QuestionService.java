package pro.sky.coursework.services;

import pro.sky.coursework.domains.Question;

import java.util.Collection;

public interface QuestionService {
    Question add(String question, String answer);

    Question add(Question question);

    Question remove(Question question);

    Collection<Question> getAll();

    Integer getRandomQuestion(Integer amount);
}
