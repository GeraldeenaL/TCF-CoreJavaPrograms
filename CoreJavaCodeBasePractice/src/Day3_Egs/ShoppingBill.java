package Day3_Egs;

public class ShoppingBill {

	public static void main(String[] args) {
		String custName="Jacob";
		String prodName="Dresses";
		double prodPrice=2500.98d;
		int prodQuantity=2;
		float GST=0.18f;
		double totalAmt;
		double gstAmt;
		double finalAmt;
		
		totalAmt=prodPrice*prodQuantity;
		gstAmt=totalAmt*GST;
		finalAmt=totalAmt+gstAmt;
		
		System.out.println("********************************");
		System.out.println("ABC Shopping Mall");
		System.out.println("********************************");
		System.out.println("Customer Name: "+custName);
		System.out.println("Product Name: "+prodName);
		System.out.println("Product Price: "+prodPrice);
		System.out.println("Quantity: "+prodQuantity);
		System.out.println("GST: "+GST);
		System.out.println("Total Amout: "+totalAmt);
		System.out.println("GST Amount: "+gstAmt);
		System.out.println("Final Bill Amount: "+finalAmt);
		String delivDis=(finalAmt>=1000.0)?"Eligible for free delivery":"Delivery charges applicable";
		System.out.println("Delivery Charges:"+delivDis);
		

	}

}
