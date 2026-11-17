package day17_Egs;
import java.util.*;

public class MultiCatchDemo {

	public static void main(String[] args) {
		int n1,n2,n3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		while(true) {
			try {
				n1=sc.nextInt();
				n2=sc.nextInt();
				n3=n1/n2;
				System.out.println("Division is: "+n3);
				break;
				
			}
			catch(InputMismatchException e) {
				System.out.println("Invalid Input:PLease enter integers only!");
				sc.nextLine();
			}
			catch(ArithmeticException e) {
				System.out.println("Exception caught: "+e.getMessage());
				break;
			}
			catch(Exception e) {
				System.out.println("Exception caught: "+e.getMessage());
				break;
			}
		}
		

	}

}
