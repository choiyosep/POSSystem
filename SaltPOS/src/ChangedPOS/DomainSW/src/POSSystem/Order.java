package POSSystem;

import java.util.ArrayList;

public class Order {

	public static int lastOrderNumber=0;
	
	private int orderNumber;
	private int price = 0;
	private ArrayList<OrderedFood> orderedFoodList = new ArrayList<>();
	private Payment payment;
	
	Order(){
		setOrderNumber(Order.lastOrderNumber + 1);
		Order.lastOrderNumber++;
	}

	public int getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}
	
	public int getTotal(){
		price = 0;
		for(int i=0;i<orderedFoodList.size();i++)
		price += orderedFoodList.get(i).getSubtotal();
		return price;
	}
	
	public void makeLineItem(FoodInfo foodInfo,int quantity){
		OrderedFood orderedFood = new OrderedFood(foodInfo,quantity);
		orderedFoodList.add(orderedFood);	
	}
	
	public ArrayList<OrderedFood> getOrderdedFoodList(){
		return orderedFoodList;
	}

	public void enterCustomer(String phone_number) {
		
	}
}