//To define the program for Device base class from inheritance
package day14_Egs;


public class Device {
	private String os;
	private double price;
	private String brand;
	private String model;
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	@Override
	public String toString() {
		return "Device [os=" + os + ", price=" + price + ", brand=" + brand + ", model=" + model + "]";
	}
	
	public Device() {
		System.out.println("Object created for device class!");
	}
	 public Device(String os,double price,String brand,String model) {
		 this();
		 this.os=os;
		 this.price=price;
		 this.brand=brand;
		 this.model=model;
		 
	 }

}
