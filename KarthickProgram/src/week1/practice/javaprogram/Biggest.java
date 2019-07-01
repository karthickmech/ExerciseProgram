package week1.practice.javaprogram;

import java.util.Scanner;
public class Biggest {
    int number1,number2;
    
    void getInput()
    {
    	Scanner scan= new Scanner(System.in);
    	System.out.println("Enter number1");
    	number1= scan.nextInt();
    	
    	System.out.println("Enter number2");
    	number2= scan.nextInt();
    	
    }
    void toFind()
    {
    	if(number1>number2)
    	{
    		System.out.println(number1+"is big");
    	}
    	else
    	{
    	    System.out.println(number2+" is big");
    	}    	
    }
}
