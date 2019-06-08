package POSSystem;
import java.util.ArrayList;
import java.util.Date;

public class Register {
	private static ArrayList<Refund> refundList = new ArrayList<>();
	private static OrderList orderList = new OrderList();

	private static Refund currentRefund;
	private static Order currentOrder;
	private CalculateSale currentCaculateSale;
	private ClientList clist = ClientList.getInstance();
	private ArrayList<Client> currentClientList = clist.getList();
	private int change = 0;
	
	public void getScreen() {
		System.out.println("1. 결제하기");
		System.out.println("2. 환불하기");
		System.out.println("3. 환불하기");
		System.out.println("기능을 선택하세요.");
	}
	
	
	/* refund method */
	
	public static void makeRefund(){
		Register.currentRefund = new Refund(new Date().toString());
	}
	
	public static void enterOrderNumber(int orderNumber){
		Order order = orderList.getOrderInfo(orderNumber);
		currentRefund.doRefund(order, orderNumber);
	}
	
	
	/* info method */
	
	public static void addOrderInfo(){
		orderList.insertOrder(currentOrder);
	}
	
	public static void addRefundInfo(){
		orderList.insertRefund(currentRefund);
	}

	/* caculate sale*/
	public void makeCalculateSale() {
		currentCaculateSale = new CalculateSale();
	}

	public int requestCalculateSale() {
		if(currentCaculateSale.equals(null)) makeCalculateSale();
		currentCaculateSale.calculate(currentOrder, currentRefund);
		return currentCaculateSale.getCalculateSale();
	}
	
	/* payment method*/
	
	public static void makeCashPayment() {
		currentOrder.makePayment("CashPayment");
	}
	
	public static void makeCreditPayment() {
		currentOrder.makePayment("CreditPayment");		
	}
	
	public static void makeGiftPayment() {
		currentOrder.makePayment("GiftPayment");		
	}
	
	public static void makePointPayment() {
		currentOrder.makePayment("PointPayment");		
	}
	
	
	
	
	/* Client */
	public void registerClient(String phoneNumber) {
		Client client = new Client(phoneNumber);
		currentClientList.add(client);
	}
	
	/* getter & setter */
	
	public static Order getCurrentOrder() {
		return currentOrder;
	}
	public static void setCurrentOrder(Order currentOrder) {
		Register.currentOrder = currentOrder;
	}
	
	
	public static ArrayList<Refund> getRefundList() {
		return refundList;
	}

	public static void setRefundList(ArrayList<Refund> refundList) {
		Register.refundList = refundList;
	}

	public static Refund getCurrentRefund() {
		return currentRefund;
	}

	public static void setCurrentRefund(Refund currentRefund) {
		Register.currentRefund = currentRefund;
	}

	public static OrderList getOrderList() {
		return orderList;
	}

	public static void setOrderList(OrderList orderList) {
		Register.orderList = orderList;
	}


	public static void enterCash(int cash) {
		currentOrder.showChange();
	}


	public static void enterCreditInfo(String cardNumber) {
		// TODO Auto-generated method stub
		
	}


	public static void enterGiftInfo(String giftNumber) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
