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
		System.out.println("��ǰ�ǹ�ȣ :" + info);
		System.out.println("�����ݾ� : " + total);
	}

}
