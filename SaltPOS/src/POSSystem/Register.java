package POSSystem;
import java.util.ArrayList;
import java.util.Date;

public class Register {
	private static ArrayList<Refund> refundList = new ArrayList<>();
	private static Refund currentRefund;
	private static Order currentOrder;
	private static FoodCourt foodCourt = new FoodCourt();
	private static UserInterfaceList userInterfaceList;
	private static UserInterface userInterface;
	private CalculateSale currentCaculateSale;
	private ClientList clist = ClientList.getInstance();
	private ArrayList<Client> currentClientList = clist.getList();
	
	/* order method */
	public static void makeNewOrder(){
		Order order = new Order(new Date().toString());
		currentOrder = order;
	}	

	public static void enterItem(int id,int quantity){
		FoodInfo foodInfo = foodCourt.getMenu().getFoodInfo(id);
		currentOrder.makeLineItem(foodInfo, quantity);
	}
	
	/* refund method */
	
	public static void makeNewRefund(){
		Register.currentRefund = new Refund(new Date().toString());
	}
	
	public static void enterOrderNumber(int orderNumber){
		Order order = foodCourt.getOrderList().getOrderInfo(orderNumber);
		currentRefund.doRefund(order);
	}
	
	public static void updatePersonalInterface(){
		userInterfaceList.update(userInterface);
	}
	
	/* info method */
	
	public static void addOrderInfo(){
		foodCourt.getOrderList().insertOrder(currentOrder);
	}
	
	public static void addRefundInfo(){
		foodCourt.getOrderList().insertRefund(currentRefund);
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
	
}

 
