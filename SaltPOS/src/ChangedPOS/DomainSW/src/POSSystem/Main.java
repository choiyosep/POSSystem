package POSSystem;

import java.util.ArrayList;

public class Main { 
	public static void main(String[] arg) {
		Tablet tablet = new Tablet();
		
		tablet.addFoodinfo(new FoodInfo("짜장면", 5000));
		tablet.addFoodinfo(new FoodInfo("짬뽕", 6000));
		tablet.addFoodinfo(new FoodInfo("볶음밥", 5500));
		
		ArrayList<FoodInfo> foodInfoList = tablet.getMenu();
		
		tablet.showMenu();
		
//		do {
//			System.out.println("주문할 음식 번호를 선택하세요");
//			
//			
//		} while(true);
	}
	
	
	
}
