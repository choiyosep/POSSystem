package POSSystem;

public class RFactory {
	static RFactory instance;
	Payment payment;

	public static synchronized RFactory getInstance() {
		if (instance.equals(null))
			instance = new RFactory();
		return instance;
	}

	public Payment getPayment(String paymentType) {
		if (payment.equals(null)&&!(Payment.class.getName().equals(paymentType))){ 
			String ClassName = System.getProperty(paymentType);
			try {
				Payment payment = (Payment)(Class.forName(ClassName).newInstance());
			} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return payment;	
	} 
}
