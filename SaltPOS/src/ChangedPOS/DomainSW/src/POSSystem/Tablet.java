package POSSystem;

import java.util.ArrayList;

public class Tablet {

	private ArrayList<FoodInfo> foodInfoList = new ArrayList<FoodInfo>();

	private static Order order = new Order();
	// singleton
	public static Order getInstance() {
		return order;
	}
	
	public void getMenu(){
		showMenu();
	}
	
	public void showMenu() {
		System.out.println("�ֹ��� ���� ��ȣ�� �����ϼ���.");
		for(int i=0; i<foodInfoList.size(); i++) {
			System.out.print((i+1)+"."+foodInfoList.get(i).getName()+"("+foodInfoList.get(i).getPrice()+"��) ");
		}
		System.out.print("0.�ֹ�����");
	
		System.out.println();
	}
	
	public void selectMenu(int id, int quantity) {
		order.makeLineItem(foodInfoList.get(id), quantity);
	}
	
	public Order orderMenu() {
		return order;
	}
	
	
	public FoodInfo getFoodInfo(int foodNumber){
		return foodInfoList.get(foodNumber);
	}
	
	public void addFoodinfo(FoodInfo foodInfo){
		foodInfoList.add(foodInfo);
	}

	public void showOrderInfo() {
		System.out.println("�ֹ� �Ϸ�");
		System.out.println("�ֹ���ȣ�� "+ order.getOrderNumber() + "�Դϴ�.");
		
	}

	
	
	
}