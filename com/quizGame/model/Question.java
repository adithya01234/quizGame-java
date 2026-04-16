package com.quizGame.model;

public class Question {
    private String question;
    private String[] options;
    private char correctAnswer;
    
   public Question(String question,String [] options,char correctAnswer)
    {
        this.correctAnswer=correctAnswer;
        this.options=options;
        this.question=question;
    }

    public String getQuestion() {
        return question;
    }

    public String[] getOptions() {
        return options;
    }

    public char getCorrectAnswer() {
        return correctAnswer;
    }

    
    
}
