package pl.MateuszLukaszczyk.QuizAndSurveyApplication.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pl.MateuszLukaszczyk.QuizAndSurveyApplication.models.Quiz;

import java.util.List;
import java.util.Optional;

public interface QuizRepository extends JpaRepository<Quiz, Long> {

}
