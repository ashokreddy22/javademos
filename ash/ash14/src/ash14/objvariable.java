package ash14;

import java.util.Scanner;
import java.lang.Math;

public class objvariable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num1, num2;
		char operator;
		System.out.println("Enter a num1&num2 values : ");
		num1 = sc.nextDouble();
		num2 = sc.nextDouble();
        double result=0;
    	System.out.println("enter a operation +,-,*,/,%");
    	operator = sc.next().charAt(0);
        switch(operator) {
    	case '+':
    		 result= num1+num2;
    	break;
    	case '-':
    		//double large=largest(num1,num2);
    		result=(num1-num2);
    		
    	break;
   
    	case '*':
    		result=num1*num2;
    	break;
    	case '/':
    	    result= num1/num2;
    	break;
    	case '%':
    	    result= num1%num2;
    	break;
    	default:
    		System.out.println("wrongly entered a numbers");
    	break;	}
        
       System.out.println(num1 +" "+operator+" "+ num2 +"=" + result);
       // return result;	
	}
}