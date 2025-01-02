package pro.sky.coursework.services;

import pro.sky.coursework.domains.Question;
import pro.sky.coursework.repositories.JavaQuestionRepositoryImpl;

import java.util.Collection;

public class JavaQuestionServiceImpl implements QuestionService {
    JavaQuestionRepositoryImpl javaQuestionRepository;

    public JavaQuestionServiceImpl(JavaQuestionRepositoryImpl javaQuestionRepository) {
        this.javaQuestionRepository = javaQuestionRepository;
    }

    @Override
    public Question add(Question question) {
        return javaQuestionRepository.add(question);
    }

    @Override
    public Question add(String question, String answer) {
        return javaQuestionRepository.add(new Question(question, answer));
    }

    @Override
    public Question remove(Question question) {
        return javaQuestionRepository.remove(question);
    }

    @Override
    public Question remove(String question, String answer) {
        return javaQuestionRepository.remove(new Question(question, answer));
    }

    @Override
    public Question find(Question question) {
        return javaQuestionRepository.find(question);
    }

    @Override
    public Question find(String question, String answer) {
        return javaQuestionRepository.find(new Question(question, answer));
    }

    @Override
    public Collection<Question> getAll() {
        return javaQuestionRepository.getAll();
    }

    @Override
    public Collection<Question> removeAll() {
        return javaQuestionRepository.removeAll();
    }
}
