package pl.MateuszLukaszczyk.QuizAndSurveyApplication.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Question")
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    String content;
    int pointForCorrectAnswer;

    @OneToOne(targetEntity = Answer.class, cascade = CascadeType.MERGE)
    Answer correctAnswer;

    @OneToMany(targetEntity = Answer.class, cascade = CascadeType.MERGE)
    @JoinColumn(name = "WhichQuestionId", referencedColumnName = "id")
    private List<Answer> answers = new ArrayList<>();

}
