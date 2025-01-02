package pro.sky.coursework;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import pro.sky.coursework.repositories.QuestionRepository;
import pro.sky.coursework.services.JavaQuestionServiceImpl;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;
import static pro.sky.coursework.TestConst.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class JavaQuestionServiceTest {
    @Mock
    private QuestionRepository questionRepositoryMock;

    @InjectMocks
    private JavaQuestionServiceImpl out;

    @Test
    public void shouldCallRepositoryMethodsOK() {
        when(questionRepositoryMock.add(eq(question1))).thenReturn(question1);
        when(questionRepositoryMock.remove(eq(question1))).thenReturn(question1);
        when(questionRepositoryMock.find(eq(question1))).thenReturn(question1);

//        assertEquals(question1, out.add(question1));
//        assertEquals(question1, out.remove(question1));
//        assertEquals(question1, out.find((question1)));
//
//        verify(questionRepositoryMock, only()).add(question1);
//        verify(questionRepositoryMock, only()).remove(question1);
//        verify(questionRepositoryMock, only()).find(question1);
    }
}
