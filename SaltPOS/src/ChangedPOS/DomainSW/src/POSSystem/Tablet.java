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
		System.out.println("주문할 음식 번호를 선택하세요.");
		for(int i=0; i<foodInfoList.size(); i++) {
			System.out.print((i+1)+"."+foodInfoList.get(i).getName()+"("+foodInfoList.get(i).getPrice()+"원) ");
		}
		System.out.print("0.주문종료");
	
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
		System.out.println("주문 완료");
		System.out.println("주문번호는 "+ order.getOrderNumber() + "입니다.");
		
	}

	
	
	
}