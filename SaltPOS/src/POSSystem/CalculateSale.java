package POSSystem;


public class CalculateSale {
	
	private static int calculateSale = 0;

	
	public static void calculate(Order order, Refund refund) {
		calculateSale = order.getTotal() - refund.getRefundPrice();
	}

	public static int getCalculateSale() {
		return calculateSale;
	}

	public static void setCalculateSale(int calculateSale) {
		CalculateSale.calculateSale = calculateSale;
	}

}
