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
		addFoodinfo(new FoodInfo("짜장면", 5000));
		addFoodinfo(new FoodInfo("짬뽕", 6000));
		addFoodinfo(new FoodInfo("볶음밥", 5500));		
	}
	
	public static void getMenu(){
		showMenu();
	}
	
	public static void showMenu() {
		System.out.println("주문할 음식 번호를 선택하세요.");
		for(int i=0; i<foodInfoList.size(); i++) {
			System.out.print((i+1)+"."+foodInfoList.get(i).getName()+"("+foodInfoList.get(i).getPrice()+"원) ");
		}
		System.out.print("0.주문종료");
	
		System.out.println();
	}
	
	public static void selectMenu(int id, int quantity) {
		Order order = Tablet.getOrder();
		order.makeLineItem(foodInfoList.get(id), quantity);
	}
	
	public static void orderMenu() {
		//주문정보 출력
		showOrderInfo();
		//POS로 주문정보 전송
		Register.addOrderInfo(order);
	}
	
	
	public static FoodInfo getFoodInfo(int foodNumber){
		return foodInfoList.get(foodNumber);
	}
	
	public static void addFoodinfo(FoodInfo foodInfo){
		foodInfoList.add(foodInfo);
	}

	public static void showOrderInfo() {
		System.out.println("주문 완료");
		System.out.println("주문번호는 "+ order.getOrderNumber() + "입니다.");
		
	}

	

	
	
	
}