package POSSystem;

import java.util.ArrayList;

public class Order {

	private String date ;
	private int orderNumber = 0 ;
	private int price = 0;
	private ArrayList<OrderedFood> orderedFoodList = new ArrayList<>();
	private Payment payment;
	
	Order(String date){
		this.setDate(date);
		setOrderNumber(getOrderNumber() + 1);
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
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
	
	public void makePayment(String paymentType){
		payment = RFactory.getInstance().getPayment(paymentType);
	}
	
	public void enterInformation(String info){
		payment.doPayment(info);
	}

	public void enterCustomer(String phone_number) {
		
	}
}
