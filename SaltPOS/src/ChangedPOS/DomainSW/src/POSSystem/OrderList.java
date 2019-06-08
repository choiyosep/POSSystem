package POSSystem;
import java.util.ArrayList;

public class OrderList {

	private ArrayList<Order> orderLists = new ArrayList<>();
	private ArrayList<Refund> refundLists = new ArrayList<>();
	
	public void insertOrder(Order order){
		orderLists.add(order);
	}
	public Order getOrderInfo(int orderNumber){
//		Order order = null;
		
//		for(int i=0; i<orderLists.size(); i++) {
//			if(orderLists.get(i).getOrderNumber() == orderNumber)
//				order = orderLists.get(i);
//		}
		
		return orderLists.get(orderNumber);
	}
	public void insertRefund(Refund refund){
		refundLists.add(refund);
	}
	@Override
	public String toString() {
		return "OrderList [orderLists=" + orderLists + ", refundLists=" + refundLists + "]";
	}
	
	
	
}