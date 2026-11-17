package egForUserDefinedExceptions;
import java.util.*;

public class TCFMall {

	public static void main(String[] args)  {
		try {
			Scanner sc = new Scanner(System.in);
			int stock=10;
			System.out.println("Enter the Quantity:  ");
			int quantity=sc.nextInt();
			ShoppingCart.placeOrder(stock, quantity);
			
			
		}
		catch(InputMismatchException e) {
			System.out.println("Please enter the valid number!");
		}
		catch(OutOfStockException e) {
			System.out.println(e.getMessage());
		}
		
		

	}

}
