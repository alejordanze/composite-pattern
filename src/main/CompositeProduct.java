package main;

import java.util.ArrayList;
import java.util.List;

public class CompositeProduct extends AbstractProduct {

	List<AbstractProduct> productsList = new ArrayList<>(); 
	
	CompositeProduct(){	
	}
	
	CompositeProduct(String name){
		super(name, 0);
	}
	
	public void addProduct(AbstractProduct p){
		productsList.add(p);
	}
	
	public void removeProduct(AbstractProduct p) {
		productsList.remove(p);
	}
	
	@Override
	public float getPrice() {
		float price = 0;
		for(AbstractProduct p : productsList) {
			price += p.getPrice();
		}
		return price;
	}
}
