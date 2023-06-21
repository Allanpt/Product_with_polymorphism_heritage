package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product {
	
	private static final DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	private LocalDate manufactureDate;
	
	
	public UsedProduct() {
		super();
	}
	public UsedProduct(String name, Double price, LocalDate manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}
	@Override
	public String priceTag() {
		return getName() + " (used) $ " + String.format("%.2f",getPrice()) + " (Manufacture date: " 
				+ manufactureDate.format(fmt1) + ")";	
	}
}
