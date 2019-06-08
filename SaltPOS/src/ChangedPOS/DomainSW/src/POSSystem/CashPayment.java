package POSSystem;

public class CashPayment extends Payment {
	
	@Override
	public void showChange(int cash, int total) {
		System.out.println("받은 금액 :" + cash);
		System.out.println("결제 금액 :" + total);
		System.out.println("잔돈 :" + (cash-total));
	}

	@Override
	public void showResult(String info, int total) {
		// Nothing
		
	}

}
