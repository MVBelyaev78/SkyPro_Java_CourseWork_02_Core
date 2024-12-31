package pro.sky.coursework;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import pro.sky.coursework.exceptions.QuestionAlreadyExistsException;
import pro.sky.coursework.exceptions.QuestionNotFoundException;
import pro.sky.coursework.services.JavaQuestionServiceImpl;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class JavaQuestionServiceTests {
    private final JavaQuestionServiceImpl javaQuestionOut = new JavaQuestionServiceImpl();

    @Test
    @Order(1)
    void addOK() {
        assertDoesNotThrow(() -> javaQuestionOut.add(TestConst.question1));
        assertTrue(javaQuestionOut.contains(TestConst.question1));
    }

    @Test
    @Order(1)
    void addAlreadyExists() {
        assertDoesNotThrow(() -> javaQuestionOut.add(TestConst.question1));
        assertThrows(QuestionAlreadyExistsException.class, () -> javaQuestionOut.add(TestConst.question1));
    }

    @Test
    @Order(1)
    void removeOK() {
        assertDoesNotThrow(() -> javaQuestionOut.add(TestConst.question1));
        assertDoesNotThrow(() -> javaQuestionOut.remove(TestConst.question1));
    }

    @Test
    @Order(1)
    void removeNotFound() {
        assertFalse(javaQuestionOut.contains(TestConst.question1));
        assertThrows(QuestionNotFoundException.class, () -> javaQuestionOut.remove(TestConst.question1));
    }

    @Test
    @Order(2)
    void getQuestionListOK() {
        javaQuestionOut.add(TestConst.question1);
        javaQuestionOut.add(TestConst.question2);
        javaQuestionOut.add(TestConst.question3);
        javaQuestionOut.add(TestConst.question4);
        javaQuestionOut.add(TestConst.question5);
        javaQuestionOut.add(TestConst.question6);
        assertEquals(TestConst.questionsInExamList,
                javaQuestionOut.getQuestionList(TestConst.numberQuestionsInExamList));
    }

    @Test
    @Order(2)
    void getQuestionListWrong() {
        javaQuestionOut.add(TestConst.question1);
        javaQuestionOut.add(TestConst.question2);
        javaQuestionOut.add(TestConst.question3);
        javaQuestionOut.add(TestConst.question4);
        javaQuestionOut.add(TestConst.question5);
        javaQuestionOut.add(TestConst.question6);
        assertNotEquals(TestConst.questionsInExamList,
                javaQuestionOut.getQuestionList(new ArrayList<>()));
        assertNotEquals(TestConst.questionsInExamList,
                javaQuestionOut.getQuestionList(new ArrayList<>(10)));
    }
}
