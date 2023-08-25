import com.builder.example.IQuizQuestion;
import com.builder.example.IQuizQuestionBuilder;
import com.builder.example.QuizQuestion;

public class Main {
    public static void main(String[] args) {
        IQuizQuestionBuilder builder1 = new QuizQuestion.Builder();

        builder1.setTitle("We Love Canada");
        builder1.setQuestion("Canada starts with…?");
        builder1.addAnswer("Canada starts with the letter ‘A’.",false);
        builder1.addAnswer("Canada starts with the letter ‘B’.",false);
        builder1.addAnswer("Canada starts with the letter ‘C’.",true);
        builder1.addAnswer("Canada starts with the letter ‘D’.",false);
        builder1.addAnswer("Canada starts with the letter ‘E’.",false);
        IQuizQuestion question1 = builder1.create();
    }
}