package POSSystem;

public class GiftPayment extends Payment {

	@Override
	public void showChange(int cash, int total) {
		System.out.println("���� ��ǰ�� :" + cash);
		System.out.println("���� �ݾ� :" + total);
		System.out.println("�ܵ� :" + (cash-total));
	}

	@Override
	public void showResult(String info, int total) {
		// Nothing
		
	}

}
