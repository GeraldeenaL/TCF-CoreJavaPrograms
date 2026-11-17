package polymorphismEg;

public class CashPayment extends Payment {
	@Override
	public void pay(double amt) {
		System.out.println("Cash Payment Rs."+amt);
		
	}

}
