package week1.practice.javaprogram;

import java.util.Scanner;
public class Triangle {
     int breath,height;
     double result;
     void getInput()
     {
    	 Scanner scan= new Scanner(System.in);
    	 System.out.println("Enter the value of breath");
    	 breath= scan.nextInt();
    	 
    	 System.out.println("Enter the value of height");
    	 height= scan.nextInt();
     }
     void display()
     {
    	 result= (0.5*breath*height);
    	 System.out.println("Area of Triangle="+result);
     }
}
