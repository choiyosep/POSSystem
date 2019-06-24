package POSSystem;

public class Refund {

	private String date;
	private int orderNumber;
	private int refundPrice;
	
	Refund(String date){
		this.date = date;
	}
	
	public void doRefund(Order order, int orderNumber){
		this.orderNumber = orderNumber; 
		refundPrice = order.getTotal();
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

	public int getRefundPrice() {
		return refundPrice;
	}

	public void setRefundPrice(int refundPrice) {
		this.refundPrice = refundPrice;
	}	
	
}
