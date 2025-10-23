package com.stashchuk.main;

import java.util.Scanner;

import com.stashchuk.classes.GeneralKnowledgeQuiz;
import com.stashchuk.classes.HistoryQuiz;
import com.stashchuk.classes.Quiz;
import com.stashchuk.classes.ScienceAndNatureQuiz;

public class QuizApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Quiz App");
        System.out.println("=======================");

        Quiz quiz = null;
        boolean validQuizTypeSelected = false;

        do {
            System.out.println("Choose the topic of quiz:");
            System.out.println("1. Science & Nature");
            System.out.println("2. General Knowledge");
            System.out.println("3. History");
            System.out.print("Option: ");
            int selectedOption = scanner.nextInt();

            if (selectedOption >= 1 && selectedOption <= 3) {
                validQuizTypeSelected = true;
            }

            switch (selectedOption) {
                case 1:
                    quiz = new ScienceAndNatureQuiz();
                    break;
                case 2:
                    quiz = new GeneralKnowledgeQuiz();
                    break;
                case 3:
                    quiz = new HistoryQuiz();
                    break;
                default:
                    System.out.println("Invalid option selected, try again.");
            }
        } while (!validQuizTypeSelected);

        quiz.startQuiz();
    }
}
