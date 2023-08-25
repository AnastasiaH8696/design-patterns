package com.builder.example;

public interface IQuizQuestion {
    void setTitle(String title);
    void setQuestion(String question);
    void addAnswer(String text, boolean correct);
}
