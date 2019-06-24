package POSSystem;

public class GiftPayment extends Payment {
	
	@Override
	public String getName() {
		return "GiftPayment";
	}
	
	@Override
	public void showChange(int cash, int total) {
		//Nothing
	}

	@Override
	public void showResult(String info, int total) {
		System.out.println("상품권번호 :" + info);
		System.out.println("결제금액 : " + total);
	}

}
