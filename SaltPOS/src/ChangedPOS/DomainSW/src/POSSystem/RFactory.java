package POSSystem;

public class RFactory {
	static RFactory instance;
	Payment payment;

	public static synchronized RFactory getInstance() {
		if (instance == null)
			instance = new RFactory();
		return instance;
	}

	public Payment getPayment(String paymentType) {
		if (payment == null && !(Payment.class.getName().equals(paymentType))){ 
			String ClassName = paymentType;
			try {
				Class c = Class.forName("POSSystem."+ ClassName);
				Payment payment = (Payment)(c.newInstance());
			} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return payment;	
	} 
}
