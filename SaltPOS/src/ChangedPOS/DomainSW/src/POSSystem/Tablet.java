package POSSystem;

import java.util.ArrayList;

public class Tablet {

	private ArrayList<FoodInfo> foodInfoList = new ArrayList<FoodInfo>();
	
	
	public ArrayList<FoodInfo> getMenu(){
		return this.foodInfoList;
	}
	
	public void showMenu() {
		for( FoodInfo foodInfo : foodInfoList) {
		}
	
		System.out.println();
	}
	
	
	public FoodInfo getFoodInfo(int foodNumber){
		return foodInfoList.get(foodNumber);
	}
	
	public void addFoodinfo(FoodInfo foodInfo){
		foodInfoList.add(foodInfo);
	}
	
	
}