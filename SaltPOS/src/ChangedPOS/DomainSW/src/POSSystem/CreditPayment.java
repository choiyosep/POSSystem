package POSSystem;

public class CreditPayment extends Payment{

	@Override
	public void showChange(int cash, int total) {
		// Nothing
		
	}

	@Override
	public void showResult(String info, int total) {
		System.out.println("카드번호 :" + info);
		System.out.println("결제금액 : " + total);
	}

		
}
