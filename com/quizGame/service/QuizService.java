package com.quizGame.service;
import com.quizGame.model.*;
import com.quizGame.data.*;
import com.quizGame.util.*;

public class QuizService
{
    public void startQuiz()
    {
        Question [] questions=QuestionData.getQuestion();
        int score=0;
        for(Question q:questions)
        {
            System.out.println(q.getQuestion());
           for(String option:q.getOptions())
           {
            System.out.println(option);
           }
           char userAnswer=InputUtil.userInput();
           if (userAnswer==q.getCorrectAnswer()) {
            score++;
            
           }
        }
        System.out.println("Final score ="+score);
    }
}