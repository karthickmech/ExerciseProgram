package ExerciseProgram;

import java.util.Scanner;
public class Student {
	 String name, foi;
	 int rollno;
	 
	 void getInput()
	 {
		 Scanner scan= new Scanner(System.in);
		 System.out.println("Enter the Name: ");
		 name= scan.nextLine();
		 
		 System.out.println("Enter the RollNo: ");
		 rollno= scan.nextInt();
	 
	     Scanner sc2= new Scanner(System.in);
	     System.out.println("Enter the FoI: ");
		 foi= sc2.nextLine();
	 
	 }
	 
     void display()
     {
    	 System.out.println("Hey,my name is "+name+".My Roll no is "+rollno+".I am Interested in "+foi+".");
     }
}
