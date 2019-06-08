package POSSystem;

import java.util.ArrayList;

public class Order {
	private int orderNumber;
	private int price = 0;
	private ArrayList<OrderedFood> orderedFoodList = new ArrayList<>();
	private Payment payment;
	
	
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
	
	//public Payment makePayment(String paymentType){
		//payment = PaymentFactory.
		//return payment;
	//}
	
	
	public ArrayList<OrderedFood> getOrderdedFoodList(){
		return orderedFoodList;
	}

	public void enterCustomer(String phone_number) {
		
	}

	@Override
	public String toString() {
		return "Order [orderNumber=" + orderNumber + ", price=" + price + ", orderedFoodList=" + orderedFoodList
				+ ", payment=" + payment + "]";
	}

	
	
	
	
	
}