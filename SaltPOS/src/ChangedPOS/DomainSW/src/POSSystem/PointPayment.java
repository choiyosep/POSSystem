package POSSystem;

public class PointPayment extends Payment{
	
	@Override
	public String getName() {
		return "PointPayment";
	}
	
	@Override
	public void showChange(int cash, int total) {
		if(cash >= total) {
			System.out.println("��� ������ : " + cash);
			System.out.println("���� �ݾ� : " + total);
			System.out.println("���� ������ : " + (cash-total));
		}
		
	}

	@Override
	public void showResult(String info, int total) {
		// TODO Auto-generated method stub
		
	}


	
}
