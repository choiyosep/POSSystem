package POSSystem;

public class CashPayment extends Payment {

	@Override
	public int doPayment(String info, int from, int to) {
		return from - to;
		
	}

}
