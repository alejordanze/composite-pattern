package main;

public class Main {
	public static void main(String[] args) {
		
		Product s8 = new Product("Galaxy S8", 250, "Samsung");
		Product s9 = new Product("Galaxy S9", 450, "Samsung");
		Product s10 = new Product("Galaxy S10", 650, "Samsung");
		Product buds = new Product("Galaxy Buds", 120, "Samsung");
		Product i11 = new Product("iPhone 11", 800, "Apple");
		Product i11pro = new Product("iPhone 11 Pro", 1000, "Apple");
		Product airpods = new Product("Airpods 3th", 300, "Apple");
		Product p30 = new Product("P30 Pro", 650, "Huawei");
		Product freeBuds = new Product("FreeBuds", 200, "Huawei");
		
		
		CompositeProduct samsungPack = new CompositeProduct("Samsung Pack");
		samsungPack.addProduct(s10);
		samsungPack.addProduct(buds);
		
		CompositeProduct applePack = new CompositeProduct("Apple Pack");
		applePack.addProduct(i11pro);
		applePack.addProduct(airpods);
		
		CompositeProduct huaweiPack = new CompositeProduct("Huawei Pack");
		huaweiPack.addProduct(p30);
		huaweiPack.addProduct(freeBuds);
		
		CompositeProduct doublePack = new CompositeProduct("Double Pack");
		doublePack.addProduct(samsungPack);
		doublePack.addProduct(applePack);
		
		CompositeProduct triplePack = new CompositeProduct("Triple Pack");
		triplePack.addProduct(samsungPack);
		triplePack.addProduct(applePack);
		triplePack.addProduct(huaweiPack);
		
		//Creating sales
		
		Sale sale = new Sale("Carlos");
		sale.addProduct(samsungPack);
		sale.printOrder();
		
		Sale sale2 = new Sale("Miguel");
		sale2.addProduct(s10);
		sale2.addProduct(buds);
		sale2.printOrder();
		
		Sale sale4 = new Sale("Tatiana");
		sale4.addProduct(applePack);
		sale4.printOrder();
		
		Sale sale3 = new Sale("Daniela");
		sale3.addProduct(doublePack);
		sale3.printOrder();
		
		Sale sale5 = new Sale("Carolina");
		sale5.addProduct(triplePack);
		sale5.printOrder();
	}
}
