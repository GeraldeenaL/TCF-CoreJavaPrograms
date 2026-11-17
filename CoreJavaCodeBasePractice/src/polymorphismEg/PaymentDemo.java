package polymorphismEg;
import java.util.*;

public class PaymentDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount:  ");
		double amt=sc.nextDouble();
		sc.nextLine();
		System.out.println("Enter the payment mode:  ");
		String mode=sc.nextLine();
		Payment p;
		if(mode.equalsIgnoreCase("UPI")) {
			p=new UPIPayment();
			p.pay(amt);
		}
		else if(mode.equalsIgnoreCase("Card")) {
			p=new CardPayment();
			p.pay(amt);
		}
		else if(mode.equalsIgnoreCase("Cash")) {
			p=new CashPayment();
			p.pay(amt);
		}
		else {
			System.out.println("Please enter a valid payment mode");
		}
		

	}

}
