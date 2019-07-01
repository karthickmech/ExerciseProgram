package week1.practice.javaprogram;

import java.util.Scanner;
public class SimpleIntrest {
	int productprice;
	float discountrate,discountamount,salesprice;
	
	void getInput()
	{
	Scanner  scan= new Scanner(System.in);
	System.out.println("Enter the Productprice:");
	productprice= scan.nextInt();
	
	System.out.println("Enter the discountrate:");
	productprice= scan.nextInt();
	
	}
	void display1()
	{
		discountamount= (productprice* discountrate/100);
		System.out.println("Discountrate ="+discountamount);
	}
	void display2()
	{
		salesprice= productprice- discountamount;
		System.out.println("Salesprice ="+salesprice);
		
	}

}
