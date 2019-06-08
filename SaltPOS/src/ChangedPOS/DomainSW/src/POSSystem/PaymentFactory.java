package POSSystem;

public class PaymentFactory extends Factory {

	@Override
	public Payment makePayment(String name) {
		switch(name) {
		case "CashPayment" : return new CashPayment();
		case "CreditPayment" : return new CreditPayment();
		case "GiftPayment" : return new GiftPayment();
		case "PointPayment" : return new PointPayment();
		}
		return null;
	}
}
