package Day4_Egs;
import java.util.*;

public class StudentDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String stdName;
		int stdAge;
		String dept;
		String clgName;
		float CGPA;
		long mobile;
		 
		 System.out.println("Enter Student Name: ");
		 stdName=sc.nextLine();
		 System.out.println("Enter Student Age: ");
         stdAge=sc.nextInt();
         sc.nextLine();
         System.out.println("Enter Student Department: ");
         dept=sc.nextLine();
         System.out.println("Enter College Name: ");
         clgName=sc.nextLine();
         System.out.println("Enter CGPA: ");
         CGPA=sc.nextFloat();
         System.out.println("Enter the mobile Number: ");
         mobile=sc.nextLong();
         
         System.out.println("=========STUDENT DETAILS=========");
         System.out.println("Name    :"+stdName);
         System.out.println("Age     :"+stdAge);
         System.out.println("Department:"+dept);
         System.out.println("College Name:"+clgName);
         System.out.println("CGPA    :"+CGPA);
         System.out.println("Mobile Number:"+mobile);
         System.out.println("=================================");
	}

}
