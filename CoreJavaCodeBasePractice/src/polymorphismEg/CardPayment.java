package polymorphismEg;

public class CardPayment extends Payment {
	@Override
	public void pay(double amt) {
		System.out.println("Card Payment Rs."+amt);
	}

}
