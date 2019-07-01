package week1.practice.javaprogram;

public class Arithmatic {
     int number1,number2;
     int result;
     
     Arithmatic()
     {
    	 number1=10;
    	 number2=15;
     }
     void add()
     {
    	 result= number1+number2;
    	 System.out.println("Answer for addition is:"+result);
     }
     void sub()
     {
    	 result= number1-number2;
    	 System.out.println("Answer for subraction is:"+result);
     }
     void multiply()
     {
    	 result= number1*number2;
    	 System.out.println("Answer for multiplication is:"+result);
    	 
     }
     void divid()
     {
    	 result= number1/number2;
    	 System.out.println("Answer for divition is:"+result);
     }
}
