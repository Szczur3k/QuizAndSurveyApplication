package pl.MateuszLukaszczyk.QuizAndSurveyApplication.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.MateuszLukaszczyk.QuizAndSurveyApplication.models.Answer;

public interface AnswerRepository extends JpaRepository<Answer, Long> {
}
