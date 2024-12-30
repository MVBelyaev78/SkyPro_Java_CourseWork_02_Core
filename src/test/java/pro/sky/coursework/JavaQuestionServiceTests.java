package pro.sky.coursework;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import pro.sky.coursework.exceptions.QuestionAlreadyExistsException;
import pro.sky.coursework.exceptions.QuestionNotFoundException;
import pro.sky.coursework.services.JavaQuestionService;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class JavaQuestionServiceTests {
    private JavaQuestionService javaQuestionOut = new JavaQuestionService();

    @Test
    void addOK() {
        assertDoesNotThrow(() -> javaQuestionOut.add(TestConst.question1));
        assertTrue(javaQuestionOut.contains(TestConst.question1));
    }
    @Test
    void addAlreadyExists() {
        assertDoesNotThrow(() -> javaQuestionOut.add(TestConst.question1));
        assertThrows(QuestionAlreadyExistsException.class, () -> javaQuestionOut.add(TestConst.question1));
    }
    @Test
    void removeOK() {
        assertDoesNotThrow(() -> javaQuestionOut.add(TestConst.question1));
        assertDoesNotThrow(() -> javaQuestionOut.remove(TestConst.question1));
    }
    @Test
    void removeNotFound() {
        assertFalse(javaQuestionOut.contains(TestConst.question1));
        assertThrows(QuestionNotFoundException.class, () -> javaQuestionOut.remove(TestConst.question1));
    }
}
