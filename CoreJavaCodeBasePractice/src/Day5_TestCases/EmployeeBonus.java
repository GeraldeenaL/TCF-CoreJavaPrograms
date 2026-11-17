package Day5_TestCases;
import java.util.*;

public class EmployeeBonus {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Employee Name:   ");
		String empName=sc.nextLine();
		System.out.println("Enter Employee Salary:  ");
		double empSalary=sc.nextDouble();
		System.out.println("Enter the Employee Experience:  ");
		float empExp=sc.nextFloat();
		double netSalary;
		
		if(empExp>=10) {
			netSalary=empSalary+(empSalary*0.20);
		}
		else if(empExp>=5) {
			netSalary=empSalary+(empSalary*0.10);
		}
		else if(empExp>=2) {
			netSalary=empSalary+(empSalary*0.5);
		}
		else {
			netSalary=empSalary;
		}
		System.out.println("Employee Name:  "+empName);
		System.out.println("Employee Salary:   "+empSalary);
		System.out.println("Employee Experience:   "+empExp);
		System.out.println("Net Salary:          "+netSalary);
		
		}
		
	}


