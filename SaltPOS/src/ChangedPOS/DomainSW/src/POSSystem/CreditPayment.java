package POSSystem;

public class CreditPayment extends Payment{

	@Override
	public void showChange(int cash, int total) {
		// Nothing
		
	}

	@Override
	public void showResult(String info, int total) {
		System.out.println("ī���ȣ :" + info);
		System.out.println("�����ݾ� : " + total);
	}

		
}
