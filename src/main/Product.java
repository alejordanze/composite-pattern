package main;

public class Product extends AbstractProduct {

	private String brand;

	Product(String name, float price, String brand){
		super(name, price);
		this.brand = brand;
	}
	
	Product(){
	}
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	
}
