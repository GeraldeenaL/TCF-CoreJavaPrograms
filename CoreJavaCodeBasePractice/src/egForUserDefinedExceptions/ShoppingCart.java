package egForUserDefinedExceptions;

public class ShoppingCart {
	static void placeOrder(int stock,int quantity )throws OutOfStockException {
		if(quantity>stock) {
			throw new  OutOfStockException("Not Enough Stock");
				}
		System.out.println("Order Placed Successfully!!");
		
	}
	

}
