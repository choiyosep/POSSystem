package POSSystem;

import java.util.ArrayList;

public class Tablet {

	private ArrayList<FoodInfo> foodInfoList = new ArrayList<FoodInfo>();
	
	
	public ArrayList<FoodInfo> getMenu(){
		return this.foodInfoList;
	}
	
	public void showMenu() {
		System.out.println("주문할 음식 번호를 선택하세요.");
		for(int i=0; i<foodInfoList.size(); i++) {
			System.out.print((i+1)+"."+foodInfoList.get(i).getName()+"  ");
		}
		System.out.print("0.주문종료");
	
		System.out.println();
	}
	
	
	public FoodInfo getFoodInfo(int foodNumber){
		return foodInfoList.get(foodNumber);
	}
	
	public void addFoodinfo(FoodInfo foodInfo){
		foodInfoList.add(foodInfo);
	}
	
	
}