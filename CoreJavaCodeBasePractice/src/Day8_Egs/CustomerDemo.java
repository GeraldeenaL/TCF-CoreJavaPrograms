package Day8_Egs;

public class CustomerDemo {

	public static void main(String[] args) {
		Customer c1=new Customer();
		Customer c2=new Customer();
		Customer c3=new Customer();
		Customer c4=new Customer(9889,"Regular Customer","Mumbai");
		
		c1.setCustId(2001);
		c1.setCustName("Priya");
		c1.setCity("Banglore");
		
		c2.setCustId(2009);
		c2.setCustName("Rahul");
		c2.setCity("Chennai");
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
        
	}

}
