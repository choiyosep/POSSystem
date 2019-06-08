package POSSystem;


public class CalculateSale {
	
	private static int calculateSale = 0;

	
	public void calculate(Order order, Refund refund) {
		calculateSale = order.getTotal() - refund.getRefundPrice();
	}

	public int getCalculateSale() {
		return calculateSale;
	}

	public void setCalculateSale(int calculateSale) {
		CalculateSale.calculateSale = calculateSale;
	}

}
