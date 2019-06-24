package POSSystem;
import java.util.ArrayList;

public class OrderList {

	private ArrayList<Order> orderLists = new ArrayList<>();
	private ArrayList<Refund> refundLists = new ArrayList<>();
	
	public void insertOrder(Order order){
		orderLists.add(order);
	}
	public Order getOrderInfo(int orderNumber){		
		return orderLists.get(orderNumber);
	}
	public void insertRefund(Refund refund){
		refundLists.add(refund);
	}
	@Override
	public String toString() {
		return "OrderList [orderLists=" + orderLists + ", refundLists=" + refundLists + "]";
	}
	public ArrayList<Order> getOrderLists() {
		return orderLists;
	}
	public void setOrderLists(ArrayList<Order> orderLists) {
		this.orderLists = orderLists;
	}
	public ArrayList<Refund> getRefundLists() {
		return refundLists;
	}
	public void setRefundLists(ArrayList<Refund> refundLists) {
		this.refundLists = refundLists;
	}
	
	
	
	
	
}