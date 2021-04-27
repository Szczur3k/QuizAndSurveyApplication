package pl.MateuszLukaszczyk.QuizAndSurveyApplication.models;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Question {

    String content;
    int pointForCorrectAnswer;
    List<Answer> answers;
    List<Answer> correctAnswers;

}
