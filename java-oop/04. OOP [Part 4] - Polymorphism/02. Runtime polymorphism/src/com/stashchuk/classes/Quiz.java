package com.stashchuk.classes;

import java.util.Scanner;

public class Quiz {
    protected Question[] questions;
    private int score;
    private int correctAnswerCount;
    private int wrongAnswerCount;
    private final int pointsPerQuestion;

    public Quiz() {
        this.questions = new Question[5];

        this.score = 0;
        this.correctAnswerCount = 0;
        this.wrongAnswerCount = 0;
        this.pointsPerQuestion = 10;
    }

    public void startQuiz() {
        for (Question question : this.questions) {
            this.askQuestion(question);
        }

        this.showQuizResult();
    }

    public void askQuestion(Question question) {
        System.out.println(question.getStatement());
        this.displayOptions(question.getOptions());

        Scanner scanner = new Scanner(System.in);
        int selectedOption = scanner.nextInt();

        while (selectedOption < 1 || selectedOption > question.getOptions().length) {
            System.out.print("Invalid input - choose the options within the range of (1 - 4): ");
            selectedOption = scanner.nextInt();
        }

        this.processAnswer(question, selectedOption);
    }

    public void displayOptions(String[] options) {
        int counter = 1;

        for (String option : options) {
            System.out.println(counter + ". " + option);
            counter++;
        }

        System.out.print("Answer: ");
    }

    public void processAnswer(Question question, int selectedOption) {
        int selectedAnswerIndex = selectedOption - 1;

        String selectedAnswer = question.getOptions()[selectedAnswerIndex];

        if (question.getCorrectAnswer().equals(selectedAnswer)) {
            this.correctAnswerCount++;
            score += 10;
            System.out.println("Correct Answer\n");
        }
        else {
            wrongAnswerCount++;
            System.out.println("Wrong Answer\n");
        }
    }

    public void showQuizResult() {
        int totalPoints = this.questions.length * this.pointsPerQuestion;

        System.out.println("Quiz Result");
        System.out.println("===========");
        System.out.println("Score: " + this.score + " / " + totalPoints);
        System.out.println("Correct Answers: " + this.correctAnswerCount);
        System.out.println("Wrong Answers: " + this.wrongAnswerCount);
    }
}
