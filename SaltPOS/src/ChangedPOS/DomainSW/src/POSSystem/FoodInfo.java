package POSSystem;

public class FoodInfo {
	private int foodNumber;
	private String name;
	private int price;
	
	FoodInfo(int foodNumber,String name,int price){
		this.foodNumber=foodNumber;
		this.name = name;
		this.price = price;
	}

	public int getfoodNumber() {
		return foodNumber;
	}
	
	public void setfoodNumber(int foodNumber) {
		this.foodNumber = foodNumber;
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