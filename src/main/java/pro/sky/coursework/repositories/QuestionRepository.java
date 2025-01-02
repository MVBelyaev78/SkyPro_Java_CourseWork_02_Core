package pro.sky.coursework.repositories;

import pro.sky.coursework.domains.Question;

import java.util.Collection;

public interface QuestionRepository {
    Question add(Question question);

    Question remove(Question question);

    Question find(Question question);

    Collection<Question> getAll();

    Collection<Question> removeAll();
}
