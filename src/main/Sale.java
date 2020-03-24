package main;

import java.util.ArrayList;
import java.util.List;

public class Sale {

	private String customerName;
	private long saleId;
	private List<AbstractProduct> productList = new ArrayList<>();
	
	Sale(){
	}
	
	Sale(String name){
		this.customerName = name;
	}
	
	public long getSaleId() {
		return saleId;
	}
	public void setSaleId(long customerId) {
		this.saleId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public List<AbstractProduct> getProductList() {
		return productList;
	}
	public void setProductList(List<AbstractProduct> productList) {
		this.productList = productList;
	}
	
	public void addProduct(AbstractProduct p) {
		productList.add(p);
	}
	
	public void removeProduct(AbstractProduct p) {
		productList.remove(p);
	}
	
	public float getSalePrice() {
		float price = 0;
		for(AbstractProduct p : productList) {
			price += p.getPrice();
		}
		return price;
	}
	
	public void printOrder() {
		System.out.println("La orden fue realizada con exito\nCliente: " + this.customerName + "\n");
		
		for(AbstractProduct p: productList) {
			System.out.println(p.getName() + " $ " + p.getPrice());
		}
		
		System.out.println("TOTAL: $ " + this.getSalePrice() + "\n");
	}
}
