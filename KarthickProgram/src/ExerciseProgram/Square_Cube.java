package ExerciseProgram;

import java.util.Scanner;
public class Square_Cube {
	    int number;
	    double result;
	    
	    void getInput()
	    {
	    	Scanner scan= new Scanner(System.in);
	    	System.out.println("Enter the value");
	    	number= scan.nextInt();
	    }
	    void display1()
	    {
	    	result= Math.pow(number,2 );
	    	System.out.println("Square value is"+result);
	    }
	    void display2()
	    {
	    	result= Math.pow(number,3);
	    	System.out.println("Cube value is"+result);
	    }
      
}
