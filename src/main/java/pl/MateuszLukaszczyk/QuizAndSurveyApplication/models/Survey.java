package pl.MateuszLukaszczyk.QuizAndSurveyApplication.models;

import org.springframework.stereotype.Component;

import java.text.DateFormat;
import java.util.List;

@Component
public class Survey {

    String title;
    String description;
    List<Question> questions;
    DateFormat createdAt;

}
