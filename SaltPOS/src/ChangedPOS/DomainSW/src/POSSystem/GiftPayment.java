package POSSystem;

public class GiftPayment extends Payment {
	
	@Override
	public String getName() {
		return "GiftPayment";
	}
	
	@Override
	public void showChange(int cash, int total) {
		if(cash >= total) {
			System.out.println("���� ��ǰ�� :" + cash);
			System.out.println("���� �ݾ� :" + total);
			System.out.println("�ܵ� :" + (cash-total));
		} else {
			System.out.println("�ݾ��� �����մϴ�.");
		}
	}

	@Override
	public void showResult(String info, int total) {
		// Nothing
		System.out.println("��ǰ�ǹ�ȣ :" + info);
		System.out.println("�����ݾ� : " + total);
	}

}
