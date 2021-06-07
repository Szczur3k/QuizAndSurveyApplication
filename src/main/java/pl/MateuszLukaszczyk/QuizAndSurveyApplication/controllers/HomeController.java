package pl.MateuszLukaszczyk.QuizAndSurveyApplication.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import pl.MateuszLukaszczyk.QuizAndSurveyApplication.models.Question;
import pl.MateuszLukaszczyk.QuizAndSurveyApplication.models.Quiz;
import pl.MateuszLukaszczyk.QuizAndSurveyApplication.repositories.QuizRepository;

import java.util.List;

@RestController("/")
public class HomeController {

    @Autowired
    QuizRepository quizRepository;

    @GetMapping
    public ModelAndView index(){
        ModelAndView mav = new ModelAndView();
        mav.addObject("quizzes", quizRepository.findAll());
        mav.setViewName("index");
        return mav;
    }

    @GetMapping("/quizzes")
    public List<Quiz> getAllQuizzes() throws Exception {
        return quizRepository.findAll();
    }

    @GetMapping("/quizzes/{id}")
    public List<Question> getAllAnswersFromQuiz(@PathVariable Long id){
        return quizRepository.getOne(id).getQuestions();
    }

}
