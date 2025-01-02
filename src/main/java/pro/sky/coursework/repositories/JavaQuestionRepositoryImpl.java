package pro.sky.coursework.repositories;

import org.springframework.stereotype.Repository;
import pro.sky.coursework.domains.Question;
import pro.sky.coursework.exceptions.QuestionAlreadyExistsException;
import pro.sky.coursework.exceptions.QuestionNotFoundException;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@Repository
public class JavaQuestionRepositoryImpl implements QuestionRepository {
    private final Set<Question> questions = new HashSet<>();

    @Override
    public Question add(Question question) {
        if (questions.contains(question)) {
            throw new QuestionAlreadyExistsException();
        }
        questions.add(question);
        return question;
    }

    @Override
    public Question remove(Question question) {
        if (questions.contains(question)) {
            questions.remove(question);
            return question;
        }
        throw new QuestionNotFoundException();
    }

    @Override
    public Question find(Question question) {
        if (!questions.contains(question)) {
            throw new QuestionNotFoundException();
        }
        return question;
    }

    @Override
    public Collection<Question> getAll() {
        return Collections.unmodifiableSet(questions);
    }

    @Override
    public Collection<Question> removeAll() {
        Collection<Question> result = Collections.unmodifiableSet(questions);
        questions.clear();
        return result;
    }
}
