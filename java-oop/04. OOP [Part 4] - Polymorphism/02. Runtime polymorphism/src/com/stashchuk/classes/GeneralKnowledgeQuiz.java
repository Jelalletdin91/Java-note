package com.stashchuk.classes;

public class GeneralKnowledgeQuiz extends Quiz {

    public GeneralKnowledgeQuiz() {
        this.questions[0] = new Question(
            "Which sign of the zodiac is represented by the Crab?",
            new String[]{ "Libra", "Virgo", "Sagittarius", "Cancer" },
            3
        );

        this.questions[1] = new Question(
            "What geometric shape is generally used for stop signs?",
            new String[]{ "Hexagon", "Octagon", "Circle", "Triangle" },
            1
        );

        this.questions[2] = new Question(
            "What is on display in the Madame Tussaud's museum in London?",
            new String[]{ "Wax sculptures", "Designer clothing", "Unreleased film reels", "Vintage cars" },
            0
        );

        this.questions[3] = new Question(
            "Which of these colours is NOT featured in the logo for Google?",
            new String[]{ "Yellow", "Blue", "Pink", "Green" },
            2
        );

        this.questions[4] = new Question(
            "What is the closest planet to our solar system's sun?",
            new String[]{ "Mercury", "Mars", "Jupiter", "Earth" },
            0
        );
    }

    @Override
    public void startQuiz() {
        System.out.println("======================");
        System.out.println("General Knowledge Quiz");
        System.out.println("======================");
        super.startQuiz();
    }
}
