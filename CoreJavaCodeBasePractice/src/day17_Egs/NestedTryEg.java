package day17_Egs;
import java.util.*;

public class NestedTryEg {

	public static void main(String[] args) {
		String line;
		int position;
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Enter the string line:  ");
			line=sc.nextLine();
			System.out.println("Enter the position:  ");
			position=sc.nextInt();
			
			try {
				System.out.println("The given position character is"+line.charAt(position));
			}
			catch(StringIndexOutOfBoundsException e) {
				System.out.println(e.getMessage());
				
			}
			
			
		}
		catch(InputMismatchException e) {
			System.out.println("Invalid Input");
			
		}
		

	}

}
