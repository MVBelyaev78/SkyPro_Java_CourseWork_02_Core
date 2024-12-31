package pro.sky.coursework.services;

import pro.sky.coursework.domains.Question;

import java.util.List;

public class ExaminerServiceImpl implements ExaminerService {
    private final JavaQuestionServiceImpl javaQuestionService = new JavaQuestionServiceImpl();

    public List<Question> getQuestions(Integer amountCurrent) {
        return javaQuestionService.getQuestionList(javaQuestionService.getRandomList(amountCurrent));
    }
}
