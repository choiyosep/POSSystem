package POSSystem;

import java.util.Scanner;

public class Main { 
	public static void main(String[] arg) {
		Tablet tablet = new Tablet();
		Order currentOrder;
		
		Register register = new Register();
		
		tablet.addFoodinfo(new FoodInfo("¥���", 5000));
		tablet.addFoodinfo(new FoodInfo("«��", 6000));
		tablet.addFoodinfo(new FoodInfo("������", 5500));
		
		
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		
		do {
			int menuNumber, count;
			tablet.getMenu();
			
			menuNumber = sc.nextInt();
			if(menuNumber == 0) {
				//�ֹ��Ϸ�
				currentOrder = tablet.orderMenu();
				tablet.showOrderInfo();
				break;
			}
			
			System.out.println("������ �Է����ּ���");
			count = sc.nextInt();
			
			tablet.selectMenu(menuNumber-1, count);
		} while(true);
		
		
		Register.getOrderList().insertOrder(currentOrder);
		Register.setCurrentOrder(currentOrder);
		
		System.out.println("==============POS System===========");
		outerloop:
		do {
			int num, orderNumber, paymentNumber, cash;
			String phoneNumber, giftNumber, cardNumber;
			register.getScreen();
			num = sc.nextInt();
			
			switch(num) {
				case(1) : // ����
					System.out.println("�ֹ���ȣ�� �Է��ϼ���.");
				 	orderNumber = sc.nextInt();
				 	System.out.println("===================");
				 	System.out.println("��������� �����ϼ���.");
				 	paymentNumber = sc.nextInt();
				 	
				 	switch(paymentNumber) {
				 		case(1) :
				 			Register.makeCashPayment();
				 			System.out.println("������ �Է��ϼ���.");
				 			Register.enterCash(sc.nextInt());
				 			break;
				 		case(2) :
				 			Register.makeCreditPayment();
				 			System.out.println("ī���ȣ �Է��ϼ���.");
			 				Register.enterCreditInfo(sc2.nextLine());
				 			break;
				 		case(3) :
				 			Register.makeGiftPayment();
				 			System.out.println("��ǰ�ǹ�ȣ�� �Է��ϼ���.");
				 			Register.enterGiftInfo(sc2.nextLine());
				 			break;
				 		case(4) :
				 			Register.makePointPayment();
				 			System.out.println("�ڵ��� ��ȣ�� �Է��ϼ���.");
				 			break;
				 	}
			
				 	
				 	
 					break;
				case(2) : // ȯ��
					Register.makeRefund();
					System.out.println("�ֹ���ȣ�� �Է��ϼ���.");
				 	orderNumber = sc.nextInt();
					Register.enterRefundOrderNumber(orderNumber);
					
					System.out.println("��������� �����ϼ���.");
				 	paymentNumber = sc.nextInt();
				 	switch(paymentNumber) {
				 		case(1) : //����
				 			break;
				 		case(2) : //ī��
				 			System.out.println("ī���ȣ �Է��ϼ���.");
				 			break;
				 		case(3) : //��ǰ��
				 			System.out.println("��ǰ�ǹ�ȣ�� �Է��ϼ���.");
				 			break;
				 		case(4) : //������
				 			System.out.println("�ڵ��� ��ȣ�� �Է��ϼ���.");
				 			break;
				 	}
					
					break;
				case(3) : // ����
					
					break;
				case(0) :
					break outerloop;
			}
			
			
			
		} while(true);
				
	
	}
	
	
	
}
