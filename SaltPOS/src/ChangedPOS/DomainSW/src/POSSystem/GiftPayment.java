package POSSystem;

public class GiftPayment extends Payment {

	@Override
	public void showChange(int cash, int total) {
		System.out.println("받은 상품권 :" + cash);
		System.out.println("결제 금액 :" + total);
		System.out.println("잔돈 :" + (cash-total));
	}

	@Override
	public void showResult(String info, int total) {
		// Nothing
		
	}

}
