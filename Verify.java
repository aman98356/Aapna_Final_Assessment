package userInput;

import java.util.Scanner;
// Code for Question number 2
public class Verify {

	public static void main(String[] args) {    
        String name;
        String yes = "fantastic";   
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter your name:");
        name = userInput.nextLine();
        System.out.println("How are you Doing : (Suggested answer- fantastic)");

        while (true) {
            String input = userInput.nextLine();
            if (input.equals(yes)){
                System.out.println("Great " + name + " ! " + yes + "Successfull");
            }
            else {
                System.out.println("UnSuccessfull");
                break;
            }    
        } 

        System.out.println("Enter second Value"); 
        String value2 = userInput.nextLine();
		  System.out.println("Second Value: " + value2);
		  System.out.println("Enter Third Value"); 
		  String value3 = userInput.nextLine();
		  System.out.println("Third Value: " + value3);
		  System.out.println("Enter Fourth Value"); 
		  String value4 = userInput.nextLine();
		  System.out.println("Fourth Value: " + value4);
		  System.out.println("Enter Fifth Value"); 
		  String value5 = userInput.nextLine();
		  System.out.println("Fifth Value: " + value5);
}}