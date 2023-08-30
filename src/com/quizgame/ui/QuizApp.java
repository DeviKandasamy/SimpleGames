package com.quizgame.ui;

import java.util.Scanner;

import com.quizgame.model.Question;
import com.quizgame.model.Quiz;

public class QuizApp {

	public static void main(String args[]){
		
		Scanner scanner = new Scanner(System.in);
		Quiz quiz  = new Quiz();
		
		Question question1 = new Question("What is the capital of France?",
                new String[]{"London", "Paris", "Berlin", "Madrid"}, 1);

        Question question2 = new Question("Which planet is known as the Red Planet?",
                new String[]{"Earth", "Mars", "Venus", "Jupiter"}, 1);
        
        quiz.addQuestion(question1);
        quiz.addQuestion(question2);
        
        for(Question question: quiz.getQuestions()){
        	System.out.println(question.getQuestionText());
        	String[] options = question.getOptions();
        	for(int i=0; i<options.length; i++){
        		System.out.println(i + 1 + "." + options[i]);
        	}
        	
        	System.out.println("Enter your choice: ");
        	int userChoice = scanner.nextInt();
        	
        	if(userChoice == question.getCorrectOption()+1)
        		System.out.println("Correct!\n");
        	else
        		System.out.println("Incorrect. The correct option is " + question.getCorrectOption()+1);
        }
        
        scanner.close();

	}
}
