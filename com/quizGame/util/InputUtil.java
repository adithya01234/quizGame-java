package com.quizGame.util;
import java.util.*;
public class InputUtil {
    static Scanner sc=new Scanner(System.in);
    public static char userInput(){
        System.out.println("Enter correct Answer");
        return sc.next().toUpperCase().charAt(0);
    }
    
}
