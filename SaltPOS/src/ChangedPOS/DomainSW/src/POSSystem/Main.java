package POSSystem;

import java.util.ArrayList;

public class Main { 
	public static void main(String[] arg) {
		Tablet tablet = new Tablet();
		
		tablet.addFoodinfo(new FoodInfo("¥���", 5000));
		tablet.addFoodinfo(new FoodInfo("«��", 6000));
		tablet.addFoodinfo(new FoodInfo("������", 5500));
		
		ArrayList<FoodInfo> foodInfoList = tablet.getMenu();
		
		tablet.showMenu();
		
//		do {
//			System.out.println("�ֹ��� ���� ��ȣ�� �����ϼ���");
//			
//			
//		} while(true);
	}
	
	
	
}
