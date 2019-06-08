package POSSystem;

public class FoodInfo {
	private String name;
	private int price;
	
	FoodInfo(String name,int price){
		this.name = name;
		this.price = price;
	}

	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}