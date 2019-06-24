package POSSystem;
import java.util.ArrayList;
import java.util.Date;

public class Register {
	private static ArrayList<Refund> refundList = new ArrayList<>();
	private static OrderList orderList = new OrderList();
	private static PaymentFactory paymentFactory = new PaymentFactory();
	private static Refund currentRefund;
	private static Order currentOrder;
	private static Payment payment;
	private static CalculateSale currentCaculateSale;	
	public static ClientList clientList = ClientList.getInstance();
	
	
	public static void startUp() {
		clientList.InsertPair("010-1234-5678", 0);
		clientList.InsertPair("010-2357-7424", 0);
	}
	
	
	
	
	public static void getScreen() {
		System.out.println("=============��� ����==========");
		System.out.println("1. �����ϱ�");
		System.out.println("2. ȯ���ϱ�");
		System.out.println("3. �����ϱ�");
		System.out.println("����� �����ϼ���.");
	}
	
	
	/* refund method */
	
	public static void makeRefund(){
		Register.currentRefund = new Refund(new Date().toString());
	}
	
	public static void enterOrderNumber(int orderNumber) {
		Order order = orderList.getOrderInfo(orderNumber);
		currentOrder = order;
	}
	
	public static void enterRefundOrderNumber(int orderNumber){
		Order order = orderList.getOrderInfo(orderNumber);
		System.out.println("======�ֹ� ����======");
		System.out.println("�ֹ���ȣ:"+order.getOrderNumber());
		ArrayList<OrderedFood> foodList = order.getOrderdedFoodList();
		for(int i=0; i< foodList.size(); i++) {
			FoodInfo food = foodList.get(i).getFoodInfo();
			System.out.println(food.getName()+"("+food.getPrice()+"��) "+"* "+foodList.get(i).getQuantity()+"�� = "+foodList.get(i).getSubtotal()+"��");
			
		}
		System.out.println("�� �ֹ� �ݾ�:"+order.getTotal());
		
		currentRefund.doRefund(order, orderNumber);
		refundList.add(currentRefund);

	}
	
	
	/* info method */
	
	public static void addOrderInfo(){
		orderList.insertOrder(currentOrder);
	}
	
	public static void addRefundInfo(){
		orderList.insertRefund(currentRefund);
	}

	/* caculate sale*/
	public static void makeCalculateSale() {
		currentCaculateSale = new CalculateSale();
	}

	public static void requestCalculateSale() {
		currentCaculateSale.calculate(orderList, refundList);
	}
	
	/* payment method*/
		
	public static void makeCashPayment() {
		setPayment(paymentFactory.makePayment("CashPayment"));
	}
	
	public static void makeCreditPayment() {
		setPayment(paymentFactory.makePayment("CreditPayment"));		
	}
	
	public static void makeGiftPayment() {
		setPayment(paymentFactory.makePayment("GiftPayment"));		
	}
	
	public static void makePointPayment() {
		setPayment(paymentFactory.makePayment("PointPayment"));	
	}
	
	public static void enterCash(int cash) {
		int total = currentOrder.getTotal();
		payment.showChange(cash, total);
	}

	public static void enterCreditInfo(String cardNumber) {
		int total = currentOrder.getTotal();
		payment.showResult(cardNumber, total);
	}

	public static void enterGiftInfo(String giftNumber) {
		int total = currentOrder.getTotal();
		payment.showResult(giftNumber, total);
	}
	
	public static boolean enterClientPhoneInfo(String phoneNumber) {
		Client client = clientList.isClient(phoneNumber);
        int currentPoint, orderPay;
        if(client != null) {
           currentPoint = client.getPoint();
           orderPay = Register.getCurrentOrder().getTotal();
           if(currentPoint >= orderPay) {
        	 payment.showChange(currentPoint, orderPay);
        	 //����Ʈ ����
        	 client.subPoint(orderPay);
           } else {
              System.out.println("�������� �����մϴ�.");
           }
           return false;
        }
        return true;
	}
	
	
	/* Client */
	public void registerClient(String phoneNumber) {
		Client client = new Client(phoneNumber);
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


	public static void setPayment(Payment payment) {
		Register.payment = payment;
	}


	public static void showRefundResult() {
		System.out.println(currentOrder.getTotal()+"�� ȯ�� �Ϸ�Ǿ����ϴ�!! �����մϴ�");
		
	}
	
	public static void showPointInfo(Client client) {
		System.out.println("�� ������: " + client.getPoint());
	}


	public static boolean enterClientInfo(String phoneNumber) {
		Client client = clientList.isClient(phoneNumber);
		if (client != null) {
			client.setPoint(Tablet.getOrder());
			Register.showPointInfo(client);
			return false;
		}
		return true;
	}
}
