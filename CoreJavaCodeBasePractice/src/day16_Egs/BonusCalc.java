package day16_Egs;
import java.util.*;

public class BonusCalc {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("------------------------------------------");
		System.out.println("        Employee Bonus System ");
		System.out.println("------------------------------------------");
		System.out.println("Enter Employee Name:");
		String name=sc.nextLine();
		System.out.println("Enter Basic Salary: ");
		double salary=sc.nextDouble();
		
		System.out.println();
		
		System.out.println("select a employee role:");
		System.out.println("1.Developer");
		System.out.println("2.Tester");
        System.out.println("3.Manager");
        System.out.println("Enter your choice:");
        int choice=sc.nextInt();
        
        Employee emp;
        
        switch(choice) {
        
        case 1: 
        	emp=new Developer(name,salary);
        	emp.calcBonus();
        	break;
        
        case 2:
        	emp=new Tester(name,salary);
        	emp.calcBonus();
        	break;
        	
        case 3:
        	emp=new Manager(name,salary);
        	emp.calcBonus();
        	break;
        	
        default:
        	System.out.println("Invalide choice!!");
        }
		sc.close();
	}
	

}
