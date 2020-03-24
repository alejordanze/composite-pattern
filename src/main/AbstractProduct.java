package main;

public abstract class AbstractProduct {
	
	private String name;
	private float price;

	AbstractProduct(String name, float price){
		this.name = name;
		this.price = price;
	}
	
	AbstractProduct(){
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
}
