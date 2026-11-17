package day18_Egs;

public class Student {
	static void checkAge(int age) throws InvalidAgeException {
		if(age>18) {
			System.out.println("Eligible for college!");
		}
		else {
			throw new InvalidAgeException("Age must  be greater than 18 or above");
		}
		
	}
	

}
