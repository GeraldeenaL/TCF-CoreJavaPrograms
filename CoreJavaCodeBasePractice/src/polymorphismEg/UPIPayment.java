package polymorphismEg;

public class UPIPayment extends Payment {
	@Override
	public void pay(double amt) {
		System.out.println("UPI Payment Rs."+amt);
		
	}
	

}
