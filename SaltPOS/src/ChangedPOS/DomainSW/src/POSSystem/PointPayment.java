package POSSystem;

public class PointPayment extends Payment{
	
	@Override
	public String getName() {
		return "PointPayment";
	}
	
	@Override
	public void showChange(int cash, int total) {
		if(cash >= total) {
			System.out.println("사용 적립금 : " + cash);
			System.out.println("결제 금액 : " + total);
			System.out.println("남은 적립금 : " + (cash-total));
		}
		
	}

	@Override
	public void showResult(String info, int total) {
		// TODO Auto-generated method stub
		
	}


	
}
