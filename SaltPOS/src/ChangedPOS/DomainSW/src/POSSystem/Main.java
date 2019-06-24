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
				// 주문완료
				tablet.orderMenu();
				// tablet의 주문정보를 POS로 전송
				break;
			}

			System.out.println("수량을 입력해주세요");
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
			case (1): // 결제
				System.out.println("주문번호를 입력하세요.");
				orderNumber = sc.nextInt();
				Register.enterOrderNumber(orderNumber);
				System.out.println("===================");
				System.out.println("결제방식을 선택하세요.");
				System.out.println("1. 현금 결제하기 2. 카드 결제하기 3. 상품권 결제하기  4. 적립금 결제하기");
				paymentNumber = sc.nextInt();
				boolean flag = true;

				switch (paymentNumber) {
				case (1):
					Register.makeCashPayment();
					System.out.println("현금을 입력하세요.");
					Register.enterCash(sc.nextInt());
					do {
						System.out.println("적립금 적립를 위해 핸드폰 번호를 입력하세요.");
						phoneNumber = sc2.nextLine();						
						flag = Register.enterClientInfo(phoneNumber);
					} while (flag);

					break;
				case (2):
					Register.makeCreditPayment();
					System.out.println("카드번호 입력하세요.");
					cardNumber= sc2.nextLine();
					Register.enterCreditInfo(cardNumber);
					do {
						System.out.println("적립금 적립를 위해 핸드폰 번호를 입력하세요.");
						phoneNumber = sc2.nextLine();
						flag = Register.enterClientInfo(phoneNumber);
					} while (flag);
					break;
				case (3):
					Register.makeGiftPayment();
					System.out.println("상품권번호을 입력하세요.");
					giftNumber = sc2.nextLine();
					Register.enterGiftInfo(giftNumber);
					do {
                        System.out.println("적립금 적립를 위해 핸드폰 번호를 입력하세요.");
                        phoneNumber =sc2.nextLine();
						flag = Register.enterClientInfo(phoneNumber);
                     } while(flag);
					break;
				case (4):
					Register.makePointPayment();
					do {
	                    System.out.println("핸드폰 번호를 입력하세요.");
	                    phoneNumber =sc2.nextLine();
						flag = Register.enterClientPhoneInfo(phoneNumber);        
	                 } while(flag);
					break;
				}
				break;
			case (2): // 환불
				Register.makeRefund();
				System.out.println("주문번호를 입력하세요.");
				orderNumber = sc.nextInt();
				Register.enterRefundOrderNumber(orderNumber);

				System.out.println("결제하셨던 방식을 선택하세요.");
				System.out.println("1. 현금 결제 2. 카드 결제 3. 상품권 결제 ");
				paymentNumber = sc.nextInt();
				switch (paymentNumber) {
				case (1): // 현금
					break;
				case (2): // 카드
					System.out.println("카드번호 입력하세요.");
					sc2.nextLine();
					break;
				case (3): // 상품권
					System.out.println("상품권번호을 입력하세요.");
					sc2.nextLine();
					break;
				}
				Register.showRefundResult();

				break;
			case (3): // 정산
				Register.makeCalculateSale();
				Register.requestCalculateSale();

				break;
			case (0):
				break outerloop;
			}

		} while (true);

	}

}
