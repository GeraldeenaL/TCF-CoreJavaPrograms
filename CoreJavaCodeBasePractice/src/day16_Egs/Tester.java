package day16_Egs;

public class Tester extends Employee {
	public Tester(String name,double salary) {
		super(name,salary);
		
	
	}
	@Override
	public void calcBonus() {
		double bonus=salary*0.08;
		double totalSalary=salary+bonus;
		System.out.println("*****Tester Details******");
		dispEmployee();
		System.out.println("Bonus percentage: 8%");
		System.out.println("Bonus amount:Rs."+bonus);
		System.out.println("Total Salary:Rs."+totalSalary);
	}

}
