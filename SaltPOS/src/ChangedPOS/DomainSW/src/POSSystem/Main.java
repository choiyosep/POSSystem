package POSSystem;

import java.util.*;

public class Main { 
	public static void main(String[] arg) {
		Tablet tablet = new Tablet();
		
		tablet.addFoodinfo(new FoodInfo("Â¥Àå¸é", 5000));
		tablet.addFoodinfo(new FoodInfo("Â«»Í", 6000));
		tablet.addFoodinfo(new FoodInfo("ººÀ½¹ä", 5500));
		
		ArrayList<FoodInfo> foodInfoList = tablet.getMenu();
		
		Scanner sc = new Scanner(System.in);
		
		do {
			int menuNumber, count;
			tablet.showMenu();
			
			menuNumber = sc.nextInt();
			if(menuNumber == 0) break;
			
			System.out.println("¼ö·®À» ÀÔ·ÂÇØÁÖ¼¼¿ä");
			count = sc.nextInt();
			
			tablet.selectMenu(menuNumber-1, count);
			
			
			
		} while(true);

	}
	
	
	
}
