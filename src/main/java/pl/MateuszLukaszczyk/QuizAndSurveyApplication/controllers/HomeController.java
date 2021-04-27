package pl.MateuszLukaszczyk.QuizAndSurveyApplication.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class HomeController {

    @GetMapping
    public String getHomePage(){
        return "There will be view with some Quizzes and Surveys";
    }

}
