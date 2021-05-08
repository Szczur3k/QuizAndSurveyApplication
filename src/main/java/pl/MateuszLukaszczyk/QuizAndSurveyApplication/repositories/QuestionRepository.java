package pl.MateuszLukaszczyk.QuizAndSurveyApplication.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.MateuszLukaszczyk.QuizAndSurveyApplication.models.Question;

public interface QuestionRepository extends JpaRepository<Question, Long> {
}
