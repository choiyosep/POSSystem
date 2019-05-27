package POSSystem;

import java.util.ArrayList;

public class Refund {

	private String date;
	private int orderNumber;
	private int refundPrice;
	
	private ArrayList<OrderedFood> orderedFoodList = new ArrayList<OrderedFood>();

	Refund(String date){
		this.date = date;
	}
	
	public void doRefund(Order order){
		orderNumber = order.getOrderNumber();
		orderedFoodList = order.getOrderdedFoodList();			
		refundPrice = orderedFoodList.get(orderNumber).getSubtotal();
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

	public ArrayList<OrderedFood> getOrderedFood() {
		return orderedFoodList;
	}

	public void setOrderedFood(ArrayList<OrderedFood> orderedFoodList) {
		this.orderedFoodList = orderedFoodList;
	}

	public int getRefundPrice() {
		return refundPrice;
	}

	public void setRefundPrice(int refundPrice) {
		this.refundPrice = refundPrice;
	}

	public ArrayList<OrderedFood> getOrderedFoodList() {
		return orderedFoodList;
	}

	public void setOrderedFoodList(ArrayList<OrderedFood> orderedFoodList) {
		this.orderedFoodList = orderedFoodList;
	}
	
	
	
	
	
	
}
