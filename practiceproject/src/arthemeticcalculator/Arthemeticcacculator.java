package arthemeticcalculator;
import java.util.Scanner;

public class Arthemeticcacculator {
	public static void main(String[] args) {
		char operator;
		Double a1,b1;
		Double result=0.0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter operator(+,-,*,/,%):");
		operator=sc.next().charAt(0);
		
		System.out.println("Enter Two Numbers:");
		a1=sc.nextDouble();
		b1=sc.nextDouble();
		
		
		if(operator == '+') {
			
			result=a1+b1;
		}else if(operator=='-') {
			result=a1-b1;
		}else if(operator=='*') {
			result=a1*b1;
		}else if(operator=='/') {
			result=a1/b1;
		}else if(operator=='%') {
			result=a1%b1;
		}else {
			System.out.println("Invalid!");
		}
		System.out.println("Answer is:"+result);
		
	}
	
}