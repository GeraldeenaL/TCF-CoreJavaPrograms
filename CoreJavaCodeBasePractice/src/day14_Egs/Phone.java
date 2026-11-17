package day14_Egs;

public class Phone extends Device{
	private String deviceType;
	private String ram;
	private String storage;
	 
	public Phone() {
		System.out.println("Object created for phone class!");
		
	}
	public Phone(String os,double price,String brand,String model,String deviceType,String ram,String storage) {
		
		super(os,price,brand,model);
		this.deviceType=deviceType;
		this.ram=ram;
		this.storage=storage;
		
	}

	
	
	public String getDeviceType() {
		return deviceType;
	}

	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getStorage() {
		return storage;
	}

	public void setStorage(String storage) {
		this.storage = storage;
	}
	@Override
	public String toString() {
		return "Phone [Os="+super.getOs()+"Price:"+super.getPrice()+"Model:"+super.getModel()+"Band:"+super.getBrand()+"Device Type:"+ deviceType + ", ram=" + ram + ", storage=" + storage + "]";
	}
	
	

}
