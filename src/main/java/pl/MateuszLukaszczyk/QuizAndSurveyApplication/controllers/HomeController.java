package pl.MateuszLukaszczyk.QuizAndSurveyApplication.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import pl.MateuszLukaszczyk.QuizAndSurveyApplication.models.Answer;
import pl.MateuszLukaszczyk.QuizAndSurveyApplication.models.Question;
import pl.MateuszLukaszczyk.QuizAndSurveyApplication.models.Quiz;
import pl.MateuszLukaszczyk.QuizAndSurveyApplication.repositories.QuizRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController("/")
public class HomeController {

    @Autowired
    QuizRepository quizRepository;


    @GetMapping("/")
    public ModelAndView getFirstPage() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("helloPage");
        mav.addObject("quizzes", quizRepository.findAll());
        return mav;
    }


    @GetMapping("/quizzes")
    public List<Quiz> getAllQuizzes() throws Exception {
        return quizRepository.findAll();
    }

    @GetMapping("/quizzes/{id}")
    public List<List<Answer>> getAllAnswersFromQuiz(@PathVariable Long id) {
        Optional<Quiz> quizFoundById = quizRepository.findById(id);
        List<List<Question>> questionsInQuiz = quizFoundById.stream().map(Quiz::getQuestions).collect(Collectors.toList());
        List<List<Answer>> correctAnswersInQuestions = questionsInQuiz.stream().map(questions -> questions.stream().map(Question::getCorrectAnswer).collect(Collectors.toList())).collect(Collectors.toList());
        return correctAnswersInQuestions;
    }

}
