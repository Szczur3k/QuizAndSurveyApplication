package pl.MateuszLukaszczyk.QuizAndSurveyApplication.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.MateuszLukaszczyk.QuizAndSurveyApplication.models.Quiz;

import java.util.List;

@RestController("/")
public class HomeController {

    @GetMapping
    public String getHomePage(){
        return "There will be view with some Quizzes and Surveys";
    }

    @GetMapping("/quizzes")
    public List<Quiz> getAllQuizzes() throws Exception {
        throw new Exception();

    }

}
