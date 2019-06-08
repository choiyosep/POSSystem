package POSSystem;

import java.util.ArrayList;

public class Tablet {

	private ArrayList<FoodInfo> foodInfoList = new ArrayList<FoodInfo>();
	
	
	public ArrayList<FoodInfo> getMenu(){
		return this.foodInfoList;
	}
	
	public void showMenu() {
		System.out.println("�ֹ��� ���� ��ȣ�� �����ϼ���.");
		for(int i=0; i<foodInfoList.size(); i++) {
			System.out.print((i+1)+"."+foodInfoList.get(i).getName()+"  ");
		}
		System.out.print("0.�ֹ�����");
	
		System.out.println();
	}
	
	
	public FoodInfo getFoodInfo(int foodNumber){
		return foodInfoList.get(foodNumber);
	}
	
	public void addFoodinfo(FoodInfo foodInfo){
		foodInfoList.add(foodInfo);
	}
	
	
}