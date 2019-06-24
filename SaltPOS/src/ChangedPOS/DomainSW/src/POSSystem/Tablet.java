package POSSystem;

import java.util.ArrayList;

public class Tablet {

	private static ArrayList<FoodInfo> foodInfoList = new ArrayList<FoodInfo>();

	private static Order order;
	// singleton
	public static Order getOrder() {
		if(order==null)
			order = new Order();
		return order;
	}
	public static void startUp() {
		addFoodinfo(new FoodInfo("¥���", 5000));
		addFoodinfo(new FoodInfo("«��", 6000));
		addFoodinfo(new FoodInfo("������", 5500));		
	}
	
	public static void getMenu(){
		showMenu();
	}
	
	public static void showMenu() {
		System.out.println("�ֹ��� ���� ��ȣ�� �����ϼ���.");
		for(int i=0; i<foodInfoList.size(); i++) {
			System.out.print((i+1)+"."+foodInfoList.get(i).getName()+"("+foodInfoList.get(i).getPrice()+"��) ");
		}
		System.out.print("0.�ֹ�����");
	
		System.out.println();
	}
	
	public static void selectMenu(int id, int quantity) {
		Order order = Tablet.getOrder();
		order.makeLineItem(foodInfoList.get(id), quantity);
	}
	
	public static void orderMenu() {
		//�ֹ����� ���
		showOrderInfo();
		//POS�� �ֹ����� ����
		Register.addOrderInfo(order);
	}
	
	
	public static FoodInfo getFoodInfo(int foodNumber){
		return foodInfoList.get(foodNumber);
	}
	
	public static void addFoodinfo(FoodInfo foodInfo){
		foodInfoList.add(foodInfo);
	}

	public static void showOrderInfo() {
		System.out.println("�ֹ� �Ϸ�");
		System.out.println("�ֹ���ȣ�� "+ order.getOrderNumber() + "�Դϴ�.");
		
	}

	

	
	
	
}