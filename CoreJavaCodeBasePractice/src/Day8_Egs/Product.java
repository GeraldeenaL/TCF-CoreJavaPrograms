package Day8_Egs;

public class Product {
	private int prodId;
	private String prodName;
	private double prodPrice;
	public Product() {
		System.out.println("Product Memory has been created!!");
	}
	
	
	public Product(int prodId,String prodName,double prodPrice) {
		this();
		this.prodId=prodId;
		this.prodName=prodName;
		this.prodPrice=prodPrice;
	}
	
	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public double getProdPrice() {
		return prodPrice;
	}
	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", prodName=" + prodName + ", prodPrice=" + prodPrice + "]";
	}
	public void setProdPrice(double prodPrice) {
		this.prodPrice = prodPrice;
	}
	

}
