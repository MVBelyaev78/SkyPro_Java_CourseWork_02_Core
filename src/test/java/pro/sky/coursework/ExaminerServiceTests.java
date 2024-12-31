package pro.sky.coursework;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import pro.sky.coursework.services.ExaminerServiceImpl;
import pro.sky.coursework.services.JavaQuestionServiceImpl;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ExaminerServiceTests {
    @Mock
    private JavaQuestionServiceImpl javaQuestionService;

    @InjectMocks
    ExaminerServiceImpl examinerOut;

    @Test
    void getQuestionsOK() {
        when(javaQuestionService.getAll()).thenReturn(TestConst.questionsTotal);
        when(javaQuestionService.getQuestionList(TestConst.numberQuestionsInExamList))
                .thenReturn(TestConst.questionsInExamList);
        assertEquals(TestConst.numberQuestionsInExam,
                examinerOut.getQuestions(TestConst.numberQuestionsInExam).size());
    }
}
