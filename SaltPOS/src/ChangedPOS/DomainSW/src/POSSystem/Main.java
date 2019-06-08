package POSSystem;

import java.util.*;

public class Main { 
	public static void main(String[] arg) {
		Tablet tablet = new Tablet();
		
		tablet.addFoodinfo(new FoodInfo("¥���", 5000));
		tablet.addFoodinfo(new FoodInfo("«��", 6000));
		tablet.addFoodinfo(new FoodInfo("������", 5500));
		
		ArrayList<FoodInfo> foodInfoList = tablet.getMenu();
		
		Scanner sc = new Scanner(System.in);
		
		do {
			int menuNumber, count;
			tablet.showMenu();
			
			menuNumber = sc.nextInt();
			if(menuNumber == 0) break;
			
			System.out.println("������ �Է����ּ���");
			count = sc.nextInt();
			
			tablet.selectMenu(menuNumber-1, count);
			
			
			
		} while(true);

	}
	
	
	
}
