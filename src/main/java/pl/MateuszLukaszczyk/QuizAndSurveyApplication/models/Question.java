package pl.MateuszLukaszczyk.QuizAndSurveyApplication.models;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.List;

@Entity
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    String content;
    int pointForCorrectAnswer;
    List<Answer> answers;
    List<Answer> correctAnswers;

    @ManyToOne
    Quiz whichQuiz;

}
