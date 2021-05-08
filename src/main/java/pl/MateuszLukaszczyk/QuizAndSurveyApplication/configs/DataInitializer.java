package pl.MateuszLukaszczyk.QuizAndSurveyApplication.configs;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import pl.MateuszLukaszczyk.QuizAndSurveyApplication.models.Question;
import pl.MateuszLukaszczyk.QuizAndSurveyApplication.models.Quiz;
//import pl.MateuszLukaszczyk.QuizAndSurveyApplication.models.Survey;
import pl.MateuszLukaszczyk.QuizAndSurveyApplication.repositories.QuestionRepository;
import pl.MateuszLukaszczyk.QuizAndSurveyApplication.repositories.QuizRepository;

import java.time.LocalDateTime;
import java.util.Arrays;

@Component
public class DataInitializer implements ApplicationRunner {

    private QuizRepository quizRepository;
    private QuestionRepository questionRepository;

    public DataInitializer(QuizRepository quizRepository, QuestionRepository questionRepository) {
        this.quizRepository = quizRepository;
        this.questionRepository = questionRepository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

        Quiz quiz1 = new Quiz();
        quiz1.setTitle("some Title");
        quiz1.setDescription("some description lala la ");
        quiz1.setCreatedAt(LocalDateTime.now());

        Question question1 = new Question();
        question1.setContent("Gdzie mieszkaja indianie?");
        question1.setPointForCorrectAnswer(0);
        questionRepository.save(question1);

        Question question2 = new Question();
        question2.setContent("Co jest na obiad?");
        question2.setPointForCorrectAnswer(0);
        questionRepository.save(question2);

        quiz1.setQuestions(Arrays.asList(question1,question2));

        quizRepository.save(quiz1);

    }
}
