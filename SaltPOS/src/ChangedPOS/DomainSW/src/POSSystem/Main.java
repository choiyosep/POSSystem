package POSSystem;

import java.util.Scanner;

public class Main {
	public static void main(String[] arg) {
		Tablet tablet = new Tablet();
		Order currentOrder;

		
		Register.startUp();
		Tablet.startUp();
		
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);

		do {
			int menuNumber, count;
			tablet.getMenu();

			menuNumber = sc.nextInt();
			if (menuNumber == 0) {
				// �ֹ��Ϸ�
				tablet.orderMenu();
				// tablet�� �ֹ������� POS�� ����
				break;
			}

			System.out.println("������ �Է����ּ���");
			count = sc.nextInt();

			tablet.selectMenu(menuNumber - 1, count);
		} while (true);

		System.out.println("==============POS System===========");
		outerloop: do {
			int num, orderNumber, paymentNumber, cash;
			String phoneNumber, giftNumber, cardNumber;

			Register.getScreen();
			num = sc.nextInt();

			switch (num) {
			case (1): // ����
				System.out.println("�ֹ���ȣ�� �Է��ϼ���.");
				orderNumber = sc.nextInt();
				Register.enterOrderNumber(orderNumber);
				System.out.println("===================");
				System.out.println("��������� �����ϼ���.");
				System.out.println("1. ���� �����ϱ� 2. ī�� �����ϱ� 3. ��ǰ�� �����ϱ�  4. ������ �����ϱ�");
				paymentNumber = sc.nextInt();
				boolean flag = true;

				switch (paymentNumber) {
				case (1):
					Register.makeCashPayment();
					System.out.println("������ �Է��ϼ���.");
					Register.enterCash(sc.nextInt());
					do {
						System.out.println("������ ������ ���� �ڵ��� ��ȣ�� �Է��ϼ���.");
						phoneNumber = sc2.nextLine();						
						flag = Register.enterClientInfo(phoneNumber);
					} while (flag);

					break;
				case (2):
					Register.makeCreditPayment();
					System.out.println("ī���ȣ �Է��ϼ���.");
					cardNumber= sc2.nextLine();
					Register.enterCreditInfo(cardNumber);
					do {
						System.out.println("������ ������ ���� �ڵ��� ��ȣ�� �Է��ϼ���.");
						phoneNumber = sc2.nextLine();
						flag = Register.enterClientInfo(phoneNumber);
					} while (flag);
					break;
				case (3):
					Register.makeGiftPayment();
					System.out.println("��ǰ�ǹ�ȣ�� �Է��ϼ���.");
					giftNumber = sc2.nextLine();
					Register.enterGiftInfo(giftNumber);
					do {
                        System.out.println("������ ������ ���� �ڵ��� ��ȣ�� �Է��ϼ���.");
                        phoneNumber =sc2.nextLine();
						flag = Register.enterClientInfo(phoneNumber);
                     } while(flag);
					break;
				case (4):
					Register.makePointPayment();
					do {
	                    System.out.println("�ڵ��� ��ȣ�� �Է��ϼ���.");
	                    phoneNumber =sc2.nextLine();
						flag = Register.enterClientPhoneInfo(phoneNumber);        
	                 } while(flag);
					break;
				}
				break;
			case (2): // ȯ��
				Register.makeRefund();
				System.out.println("�ֹ���ȣ�� �Է��ϼ���.");
				orderNumber = sc.nextInt();
				Register.enterRefundOrderNumber(orderNumber);

				System.out.println("�����ϼ̴� ����� �����ϼ���.");
				System.out.println("1. ���� ���� 2. ī�� ���� 3. ��ǰ�� ���� ");
				paymentNumber = sc.nextInt();
				switch (paymentNumber) {
				case (1): // ����
					break;
				case (2): // ī��
					System.out.println("ī���ȣ �Է��ϼ���.");
					sc2.nextLine();
					break;
				case (3): // ��ǰ��
					System.out.println("��ǰ�ǹ�ȣ�� �Է��ϼ���.");
					sc2.nextLine();
					break;
				}
				Register.showRefundResult();

				break;
			case (3): // ����
				Register.makeCalculateSale();
				Register.requestCalculateSale();

				break;
			case (0):
				break outerloop;
			}

		} while (true);

	}

}
