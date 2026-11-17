package day18_Egs;
import java.util.*;

public class StudentDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age:  ");
		int age=sc.nextInt();
		try {
			Student.checkAge(age);
		}
		catch(InvalidAgeException e) {
			System.out.println("Exception Occured!! "+e.getMessage());
		}
		

	}

}
