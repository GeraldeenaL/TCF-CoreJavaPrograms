package day16_Egs;

public class Developer extends Employee {
	public Developer(String name,double salary) {
		super(name,salary);
		
	
	}
	@Override
	public void calcBonus() {
		double bonus=salary*0.1;
		double totalSalary=salary+bonus;
		System.out.println("*****Developer Details******");
		dispEmployee();
		System.out.println("Bonus percentage: 10%");
		System.out.println("Bonus amount:Rs."+bonus);
		System.out.println("Total Salary:Rs."+totalSalary);
	}
	

}
