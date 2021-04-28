package pl.MateuszLukaszczyk.QuizAndSurveyApplication.models;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.text.DateFormat;
import java.util.List;

@Entity
public class Quiz {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    Survey surveyInQuiz;
    String title;
    String description;

    @OneToMany(mappedBy = "Quiz")
    List<Question> questions;
    DateFormat createdAt;

    public Quiz() {
    }

    public Quiz(Survey surveyInQuiz, String title, String description, List<Question> questions, DateFormat createdAt) {
        this.surveyInQuiz = surveyInQuiz;
        this.title = title;
        this.description = description;
        this.questions = questions;
        this.createdAt = createdAt;
    }
}
