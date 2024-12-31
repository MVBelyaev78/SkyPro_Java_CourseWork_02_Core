package pro.sky.coursework;

import pro.sky.coursework.domains.Question;
import pro.sky.coursework.domains.QuestionImpl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestConst {
    public static final Question question1 = new QuestionImpl("question1", "answer1");
    public static final Question question2 = new QuestionImpl("question2", "answer2");
    public static final Question question3 = new QuestionImpl("question3", "answer3");
    public static final Question question4 = new QuestionImpl("question4", "answer4");
    public static final Question question5 = new QuestionImpl("question5", "answer5");
    public static final Question question6 = new QuestionImpl("question6", "answer6");
    public static final Set<Question> questionsTotal = new HashSet<Question>() {{
        add(question1);
        add(question2);
        add(question3);
        add(question4);
        add(question5);
        add(question6);
    }};
    public static final Integer numberQuestionsInExam = 4;
    public static final List<Integer> numberQuestionsInExamList = List.of(2, 3, 1, 5);
    public static final List<Question> questionsInExamList =
            List.of(question3, question4, question2, question6);
}
