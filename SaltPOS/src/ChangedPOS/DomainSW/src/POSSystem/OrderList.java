package POSSystem;
import java.util.ArrayList;

public class OrderList {

	private ArrayList<Order> orderLists = new ArrayList<>();
	private ArrayList<Refund> refundLists = new ArrayList<>();
	
	public void insertOrder(Order order){
		orderLists.add(order);
	}
	public Order getOrderInfo(int orderNumber){
		Order order;
		order = orderLists.get(orderNumber);
		return order;
	}
	public void insertRefund(Refund refund){
		refundLists.add(refund);
	}
}