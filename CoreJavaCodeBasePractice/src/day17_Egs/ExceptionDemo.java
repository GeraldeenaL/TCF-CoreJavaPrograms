package day17_Egs;
import java.util.*;

public class ExceptionDemo {

	public static void main(String[] args) {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values for a and b: ");
		try {
		a=sc.nextInt();
		b=sc.nextInt();
		c=a/b;
		System.out.println("Division of a="+a+" and b="+b+" is "+c);
		}
		catch(ArithmeticException e) {
			System.err.println("Exception message:"+e.getMessage());
		}
		
		System.out.println("Next Line!");
		

	}

}
