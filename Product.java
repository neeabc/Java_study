package test.reflect;

public class Product {
	private String name;
	private String price;
	public Product() {
	}
	
	public Product(String name,String price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
	
	private int cost(){
		return Integer.parseInt(price)/2;
	}
}
