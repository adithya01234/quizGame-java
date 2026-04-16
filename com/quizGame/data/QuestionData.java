package com.quizGame.data;

import com.quizGame.model.*;

public class QuestionData {

    public static Question[] getQuestion() {

        return new Question[]{

            new Question("Who was the first Prime Minister of India?",
                new String[]{"A. Jawaharlal Nehru", "B. Gandhi", "C. Patel"}, 'A'),

            new Question("Who is known as the Father of the Nation?",
                new String[]{"A. Subhash Chandra Bose", "B. Mahatma Gandhi", "C. Nehru"}, 'B'),

            new Question("In which year did India get independence?",
                new String[]{"A. 1945", "B. 1947", "C. 1950"}, 'B'),

            new Question("Who was the first President of India?",
                new String[]{"A. Rajendra Prasad", "B. Abdul Kalam", "C. Nehru"}, 'A'),

            new Question("Which empire was ruled by Ashoka?",
                new String[]{"A. Gupta Empire", "B. Maurya Empire", "C. Mughal Empire"}, 'B'),

            new Question("Who built the Red Fort?",
                new String[]{"A. Akbar", "B. Shah Jahan", "C. Aurangzeb"}, 'B'),

            new Question("Which movement was led by Mahatma Gandhi in 1942?",
                new String[]{"A. Non-Cooperation", "B. Quit India Movement", "C. Civil Disobedience"}, 'B'),

            new Question("Who discovered sea route to India?",
                new String[]{"A. Vasco da Gama", "B. Columbus", "C. Cook"}, 'A'),

            new Question("Which war was fought in 1857?",
                new String[]{"A. First War of Independence", "B. World War 1", "C. Kargil War"}, 'A'),

            new Question("Who was known as 'Iron Man of India'?",
                new String[]{"A. Gandhi", "B. Sardar Vallabhbhai Patel", "C. Nehru"}, 'B'),

            new Question("Which monument is called symbol of love?",
                new String[]{"A. Qutub Minar", "B. Taj Mahal", "C. Red Fort"}, 'B'),

            new Question("Who wrote the Indian National Anthem?",
                new String[]{"A. Rabindranath Tagore", "B. Bankim Chandra", "C. Gandhi"}, 'A'),

            new Question("Who was the first woman Prime Minister of India?",
                new String[]{"A. Indira Gandhi", "B. Sarojini Naidu", "C. Kalpana Chawla"}, 'A')

        };
    }
}