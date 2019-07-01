package ExerciseProgram;

public class SimpleCalculator {
          int a=15;
          int b=8;
         double result;
          
          void add()
          {
        	  result= a+b;
        	  System.out.println("Addition is:"+result);
          }
          void sub()
          {
        	  result= a-b;
        	  System.out.println("subraction is:"+result); 
          }
          void  multi(){
        	 result= a*b;
        	  System.out.println("Multiplication is:"+result);
          }
          void divid()
          {
        	  result= a/b;
        	  System.out.println("Division is:"+result);
          }
}
