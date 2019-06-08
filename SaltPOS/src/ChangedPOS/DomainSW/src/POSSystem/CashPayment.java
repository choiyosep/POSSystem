package POSSystem;

public class CashPayment extends Payment {
	
	@Override
	public String getName() {
		return "CashPayment";
	}
	
	@Override
	public void showChange(int cash, int total) {
		if(cash >= total) {
			System.out.println("받은 금액 :" + cash);
			System.out.println("결제 금액 :" + total);
			System.out.println("잔돈 :" + (cash-total));
		} else {
			System.out.println("금액이 부족합니다.");
		}
	}

	@Override
	public void showResult(String info, int total) {
		// Nothing
		
	}

}
