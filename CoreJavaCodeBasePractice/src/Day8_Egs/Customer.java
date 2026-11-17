package Day8_Egs;

public class Customer {
	 
	private int custId;
	private String custName;
	private String city;
	
	public Customer()
	{
		this.custId=1002;
		this.custName="PVR Customer";
		this.city="Pondicherry";
	}
	public Customer(int custId,String custName,String city)
	{
		this.custId=custId;
		this.custName=custName;
		this.city=city;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", city=" + city + "]";
	}
	
	
	

}
