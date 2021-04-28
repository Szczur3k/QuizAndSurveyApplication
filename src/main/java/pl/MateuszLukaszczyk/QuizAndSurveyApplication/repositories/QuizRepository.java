package pl.MateuszLukaszczyk.QuizAndSurveyApplication.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.MateuszLukaszczyk.QuizAndSurveyApplication.models.Quiz;

public interface QuizRepository extends JpaRepository<Quiz, Long> {
}
