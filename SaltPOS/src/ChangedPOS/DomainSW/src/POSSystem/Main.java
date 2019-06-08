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
		
		System.out.println("==============POS System===========");
		
				
	
	}
	
	
	
}
