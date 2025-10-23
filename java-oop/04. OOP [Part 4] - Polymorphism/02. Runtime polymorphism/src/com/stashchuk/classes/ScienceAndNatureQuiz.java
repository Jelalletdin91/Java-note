package com.stashchuk.classes;

public class ScienceAndNatureQuiz extends Quiz {

    public ScienceAndNatureQuiz() {
        this.questions[0] = new Question(
            "Which Apollo mission was the first one to land on the Moon?",
            new String[]{ "Apollo 10", "Apollo 9", "Apollo 13", "Apollo 11" },
            3
        );

        this.questions[1] = new Question(
            "What is the largest animal currently on Earth?",
            new String[]{ "Orca", "Colossal Squid", "Blue Whale", "Giraffe" },
            2
        );

        this.questions[2] = new Question(
            "Which is the longest bone in the human body?",
            new String[]{ "Femur", "Scapula", "Fibula", "Ulna" },
            0
        );

        this.questions[3] = new Question(
            "What is the hottest planet in the Solar System?",
            new String[]{ "Mars", "Mercury", "Venus", "Jupiter" },
            2
        );

        this.questions[4] = new Question(
            "Which type of rock is created by intense heat AND pressure?",
            new String[]{ "Metamorphic", "Sedimentary", "Diamond", "Igneous" },
            0
        );
    }

    @Override
    public void startQuiz() {
        System.out.println("======================");
        System.out.println("Science & Nature Quiz");
        System.out.println("======================");
        super.startQuiz();
    }
}
