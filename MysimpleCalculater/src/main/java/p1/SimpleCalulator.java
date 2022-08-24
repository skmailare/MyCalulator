package p1;
import java.util.Scanner;
public class SimpleCalulator 
{

	// creating a java program for calulator
	 
	    public static void main(String[] args)
	    {
	 
	    	double a,b,result; // Declaring a variables 
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter first number value:");
	        a = s.nextDouble(); // taking values from user...
	        System.out.print("Enter second number value:");
	        b = s.nextDouble();
	 
	        System.out.print("Enter any operator (+, -, *, /): ");
	        char opt = s.next().charAt(0); // taking operator
	 
	        switch(opt) // using switch case to create Calculator
	        {
	            case '+':
	            	result = a + b;
	                break;    // condition for addition
	 
	            case '-':
	            	result =a - b; 
	                break; // condition for subtraction
	 
	            case '*':
	            	result = a * b;
	                break; // condition for Multiplication
	 
	            case '/':
	            	result = a / b;
	                break; // condition for Division
	 
	                default: 
	                System.out.printf("You have entered wrong operator or value");
	                return;
	        }
	 
	        System.out.println(a+" "+opt+" "+b+": "+result);
	    }
}
