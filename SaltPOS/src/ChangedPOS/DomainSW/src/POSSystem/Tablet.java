package POSSystem;

import java.util.ArrayList;

public class Tablet {

	private ArrayList<FoodInfo> foodInfoList = new ArrayList<FoodInfo>();

	private static Order order;
	// singleton
	public static Order getInstance() {
		if(order==null)
			order = new Order();
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
		Tablet.getInstance().makeLineItem(foodInfoList.get(id), quantity);
	}
	
	public void orderMenu() {
		//�ֹ����� ���
		this.showOrderInfo();
		//POS�� �ֹ����� ����
		Register.getOrderList().insertOrder(order);
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