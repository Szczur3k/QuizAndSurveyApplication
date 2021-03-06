package pl.MateuszLukaszczyk.QuizAndSurveyApplication.configs;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.security.web.server.util.matcher.AndServerWebExchangeMatcher;
import org.springframework.stereotype.Component;
import pl.MateuszLukaszczyk.QuizAndSurveyApplication.models.Answer;
import pl.MateuszLukaszczyk.QuizAndSurveyApplication.models.Question;
import pl.MateuszLukaszczyk.QuizAndSurveyApplication.models.Quiz;
//import pl.MateuszLukaszczyk.QuizAndSurveyApplication.models.Survey;
import pl.MateuszLukaszczyk.QuizAndSurveyApplication.repositories.AnswerRepository;
import pl.MateuszLukaszczyk.QuizAndSurveyApplication.repositories.QuestionRepository;
import pl.MateuszLukaszczyk.QuizAndSurveyApplication.repositories.QuizRepository;

import java.time.LocalDateTime;
import java.util.Arrays;

@Component
public class DataInitializer implements ApplicationRunner {

    private QuizRepository quizRepository;
    private QuestionRepository questionRepository;
    private AnswerRepository answerRepository;

    public DataInitializer(QuizRepository quizRepository, QuestionRepository questionRepository, AnswerRepository answerRepository) {
        this.quizRepository = quizRepository;
        this.questionRepository = questionRepository;
        this.answerRepository = answerRepository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

        Quiz quiz1 = new Quiz();
        quiz1.setTitle("Quiz o programowaniu w Javie");
        quiz1.setDescription("Sprawdzmy co potrafisz z programowania w Javie");
        quiz1.setCreatedAt(LocalDateTime.now());

        Question question1 = new Question();
        question1.setContent("Za pomoca jakiego slowa chwytamy wyjatek?");
        question1.setPointForCorrectAnswer(0);

        Answer answer1 = new Answer();
        answer1.setContent("throw");
        answer1.setIfCorrect(false);
        answerRepository.save(answer1);

        Answer answer2 = new Answer();
        answer2.setContent("try");
        answer2.setIfCorrect(true);
        answerRepository.save(answer2);

        Answer answer3 = new Answer();
        answer3.setContent("catch");
        answer3.setIfCorrect(false);
        answerRepository.save(answer3);

        Answer answer4 = new Answer();
        answer4.setContent("finally");
        answer4.setIfCorrect(false);
        answerRepository.save(answer4);

        question1.setAnswers(Arrays.asList(answer1, answer2, answer3, answer4));
        question1.setCorrectAnswer(answer2);
        questionRepository.save(question1);

 //QUIZ 2

        Question question2 = new Question();
        question2.setContent("Co jest na obiad?");
        question2.setPointForCorrectAnswer(0);
        questionRepository.save(question2);

        quiz1.setQuestions(Arrays.asList(question1,question2));

        quizRepository.save(quiz1);

    }
}
