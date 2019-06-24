package POSSystem;

public class OrderedFood {
	private int quantity;
	private FoodInfo foodInfo;
	
	OrderedFood(){
		
	}
	
	OrderedFood(FoodInfo food,int quantity){
		this.quantity = quantity;
		this.foodInfo = food;
	}
	public int getSubtotal(){
		return quantity * foodInfo.getPrice();
	}
	public FoodInfo getFoodInfo(){
		return foodInfo;
	}

	public void setFoodInfo(FoodInfo foodInfo) {
		this.foodInfo = foodInfo;
	}
	
	

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}