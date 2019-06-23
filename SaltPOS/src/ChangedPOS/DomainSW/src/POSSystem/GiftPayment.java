package POSSystem;

public class GiftPayment extends Payment {
	
	@Override
	public String getName() {
		return "GiftPayment";
	}
	
	@Override
	public void showChange(int cash, int total) {
		if(cash >= total) {
			System.out.println("받은 상품권 :" + cash);
			System.out.println("결제 금액 :" + total);
			System.out.println("잔돈 :" + (cash-total));
		} else {
			System.out.println("금액이 부족합니다.");
		}
	}

	@Override
	public void showResult(String info, int total) {
		// Nothing
		System.out.println("상품권번호 :" + info);
		System.out.println("결제금액 : " + total);
	}

}
