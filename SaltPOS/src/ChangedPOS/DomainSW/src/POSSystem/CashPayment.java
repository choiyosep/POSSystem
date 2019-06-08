package POSSystem;

public class CashPayment extends Payment {
	
	@Override
	public String getName() {
		return "CashPayment";
	}
	
	@Override
	public void showChange(int cash, int total) {
		if(cash >= total) {
			System.out.println("���� �ݾ� :" + cash);
			System.out.println("���� �ݾ� :" + total);
			System.out.println("�ܵ� :" + (cash-total));
		} else {
			System.out.println("�ݾ��� �����մϴ�.");
		}
	}

	@Override
	public void showResult(String info, int total) {
		// Nothing
		
	}

}
