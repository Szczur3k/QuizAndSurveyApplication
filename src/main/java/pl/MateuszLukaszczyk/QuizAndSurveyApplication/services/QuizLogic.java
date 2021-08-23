package pl.MateuszLukaszczyk.QuizAndSurveyApplication.services;

import org.springframework.stereotype.Service;
import pl.MateuszLukaszczyk.QuizAndSurveyApplication.models.Answer;
import pl.MateuszLukaszczyk.QuizAndSurveyApplication.models.Question;
import pl.MateuszLukaszczyk.QuizAndSurveyApplication.repositories.AnswerRepository;
import pl.MateuszLukaszczyk.QuizAndSurveyApplication.repositories.QuestionRepository;
import pl.MateuszLukaszczyk.QuizAndSurveyApplication.repositories.QuizRepository;

@Service
public class QuizLogic {

    QuizRepository quizRepository;
    QuestionRepository questionRepository;
    AnswerRepository answerRepository;

    public QuizLogic(QuizRepository quizRepository, QuestionRepository questionRepository, AnswerRepository answerRepository) {
        this.quizRepository = quizRepository;
        this.questionRepository = questionRepository;
        this.answerRepository = answerRepository;
    }


    public void addPointsWithCorrectAnswer(Question question, Answer answer){
        if (question.getCorrectAnswer().getId() == answer.getId()){
            // add points
        }
    }


}
