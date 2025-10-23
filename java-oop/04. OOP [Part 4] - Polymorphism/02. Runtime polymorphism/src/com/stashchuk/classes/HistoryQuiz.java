package com.stashchuk.classes;

public class HistoryQuiz extends Quiz {

    public HistoryQuiz() {
        this.questions[0] = new Question(
            "In what year did the Wall Street Crash take place?",
            new String[]{ "1929", "1932", "1930", "1925" },
            0
        );

        this.questions[1] = new Question(
            "Which of the following African countries was most successful in resisting colonization?",
            new String[]{ "Congo", "Namibia", "Ethiopia", "Nigeria" },
            2
        );

        this.questions[2] = new Question(
            "Which of these countries remained neutral during World War II?",
            new String[]{ "United Kingdom", "Italy", "France", "Switzerland" },
            3
        );

        this.questions[3] = new Question(
            "On what street did the 1666 Great Fire of London start?",
            new String[]{ "Pudding Lane", "Baker Street", "Houses of Parliament", "St Paul's Cathedral" },
            0
        );

        this.questions[4] = new Question(
            "The Ottoman Empire was dissolved after their loss in which war?",
            new String[]{ "Crimean War", "Serbian Revolution", "Second Balkan War", "World War I" },
            3
        );
    }

    @Override
    public void startQuiz() {
        System.out.println("======================");
        System.out.println("\tHistory Quiz");
        System.out.println("======================");
        super.startQuiz();
    }
}
