package POSSystem;

import java.util.ArrayList;

public class Menu {

	private ArrayList<FoodInfo> foodInfoList = new ArrayList<FoodInfo>();
	
	public FoodInfo getFoodInfo(int foodNumber){
		return foodInfoList.get(foodNumber);
	}
	
	public void addFoodinfo(FoodInfo foodInfo){
		foodInfoList.add(foodInfo);
	}
}
