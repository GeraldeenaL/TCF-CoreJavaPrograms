package day16_Egs;

public class Employee {
	protected String name;
	protected double salary;
	
	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
		
	}
	
	public void calcBonus() {
		System.out.println("Calculating Employee Bonus");
	}
	 public void dispEmployee() {
		 System.out.println("Employee Name: "+name);
		 System.out.println("Basic Salary: "+salary);
	 }
	
	
	

}
