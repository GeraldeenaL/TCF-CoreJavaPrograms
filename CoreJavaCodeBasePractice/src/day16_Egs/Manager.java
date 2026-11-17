package day16_Egs;

public class Manager extends Employee {
	
		public Manager(String name,double salary) {
			super(name,salary);
			
		
		}
		@Override
		public void calcBonus() {
			double bonus=salary*0.2;
			double totalSalary=salary+bonus;
			System.out.println("*****Manager Details******");
			dispEmployee();
			System.out.println("Bonus percentage: 20%");
			System.out.println("Bonus amount:Rs."+bonus);
			System.out.println("Total Salary:Rs."+totalSalary);
		}

}
