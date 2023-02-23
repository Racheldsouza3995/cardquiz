package com.example.quiz;

public class Helper {
    private Question[] questions = new Question[5];


    public Helper() {
        questions[0] = new Question("What software company is headquartered in Redmond, Washington?",
                new String[]{"Microsoft", "Google", "Apple"},
                new int[]{0}
        );
        questions[1] = new Question("What is the name of the World's largest ocean?",
                new String[]{"Atlantic Ocean", " Pacific Ocean", "Indian Ocean"},
                new int[]{1}
        );
        questions[2] = new Question("What are the programming languages used in android studio? (multiple answers)",
                new String[]{"Java", "Kotlin",
                        "React"},
                new int[]{0, 1}
        );
        questions[3] = new Question("What’s the shortcut for the “copy” function on most computers?",
                new String[]{"ctrl v",
                        "ctrl c", "ctrl c+v"},
                new int[]{1}
        );
        questions[4] = new Question("How many wisdom teeth does the average adult have?",
                new String[]{"3", "1", "4"},
                new int[]{2}
        );

    }

    public Question[] getQuestions() {
        return questions;
    }
}

