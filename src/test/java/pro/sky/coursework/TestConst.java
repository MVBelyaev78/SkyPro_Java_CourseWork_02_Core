package pro.sky.coursework;

import pro.sky.coursework.domains.Question;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestConst {
    public static final Question question1 = new Question("question1", "answer1");
    public static final Question question2 = new Question("question2", "answer2");
    public static final Question question3 = new Question("question3", "answer3");
    public static final Question question4 = new Question("question4", "answer4");
    public static final Question question5 = new Question("question5", "answer5");
    public static final Question question6 = new Question("question6", "answer6");
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
