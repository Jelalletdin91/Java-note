package com.stashchuk.classes;

public class Question {
    private final String statement;
    private final String[] options;
    private final String correctAnswer;

    public Question(String statement, String[] options, int correctAnswerIndex) {
        this.statement = statement;
        this.options = options;
        this.correctAnswer = this.options[correctAnswerIndex];
    }

    public String getStatement() {
        return statement;
    }

    public String[] getOptions() {
        return options;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }
}
