package com.builder.example;

import java.util.ArrayList;
import java.util.List;

public class QuizQuestion implements IQuizQuestion {

    private String title;
    private String question;
    private List<Answer> answers;

    private QuizQuestion() {
        answers = new ArrayList<>();
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void setQuestion(String question) {
        this.question = question;
    }

    @Override
    public void addAnswer(String text, boolean correct) {
        answers.add(new Answer(text, correct));
    }

    public static class Builder implements IQuizQuestionBuilder {
        private QuizQuestion quizQuestion;

        public Builder() {
            quizQuestion = new QuizQuestion();
        }

        @Override
        public IQuizQuestionBuilder setTitle(String text) {
            quizQuestion.setTitle(text);
            return this;
        }

        @Override
        public IQuizQuestionBuilder setQuestion(String text) {
            quizQuestion.setQuestion(text);
            return this;
        }

        @Override
        public IQuizQuestionBuilder addAnswer(String text, boolean correct) {
            quizQuestion.addAnswer(text, correct);
            return this;
        }

        @Override
        public IQuizQuestion create() {
            return quizQuestion;
        }
    }

    private static class Answer {
        String text;
        boolean correct;

        Answer(String text, boolean correct) {
            this.text = text;
            this.correct = correct;
        }
    }
}
