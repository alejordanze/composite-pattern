package main;

public class Main {
	public static void main(String[] args) {
		//Creating simple products
		
		Product cel = new Product("Galaxy S8", 250, "Samsung");
		Product cel2 = new Product("Galaxy S9", 450, "Samsung");
		Product cel3 = new Product("Galaxy S10", 650, "Samsung");
		Product aud = new Product("Galaxy FreeBuds", 120, "Samsung");
		Product cel4 = new Product("iPhone 11", 800, "Apple");
		Product cel5 = new Product("iPhone 11 Pro", 1000, "Apple");
		Product aud2 = new Product("Airpods 3th", 300, "Apple");
		
		//Creating compound products
		
		CompoundProduct samsungPack = new CompoundProduct("Samsung Pack");
		samsungPack.addProduct(cel3);
		samsungPack.addProduct(aud);
		
		CompoundProduct applePack = new CompoundProduct("Apple Pack");
		applePack.addProduct(cel5);
		applePack.addProduct(aud2);
		
		CompoundProduct doublePack = new CompoundProduct("Double Pack");
		doublePack.addProduct(samsungPack);
		doublePack.addProduct(applePack);
		
		//Creating sales
		
		Sale sale = new Sale("Carlos");
		sale.addProduct(samsungPack);
		sale.printOrder();
		
		Sale sale4 = new Sale("Tatiana");
		sale4.addProduct(applePack);
		sale4.printOrder();
		
		Sale sale2 = new Sale("Miguel");
		sale2.addProduct(cel3);
		sale2.addProduct(aud);
		sale2.printOrder();
		
		Sale sale3 = new Sale("Daniela");
		sale3.addProduct(doublePack);
		sale3.printOrder();
	}
}
