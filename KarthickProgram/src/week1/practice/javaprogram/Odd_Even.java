package week1.practice.javaprogram;

import java.util.Scanner;
public class Odd_Even {
       int number1;
       
       void getInput()
       {
    	   Scanner scan= new Scanner(System.in);
    	   System.out.println("Enter the number");
    	   number1= scan.nextInt();
       }
       void toFind()
       {
    	   if(number1%2==0)
    	   {
    		   System.out.println(number1+"is even");
    	   }
    	   else
    	   {
    		System.out.println(number1+"is odd");   
    	   }
       }
}
