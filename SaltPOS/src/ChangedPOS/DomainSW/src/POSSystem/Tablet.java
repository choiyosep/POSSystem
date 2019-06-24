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
		System.out.println("주문할 음식 번호를 선택하세요.");
		for(int i=0; i<foodInfoList.size(); i++) {
			System.out.print((i+1)+"."+foodInfoList.get(i).getName()+"("+foodInfoList.get(i).getPrice()+"원) ");
		}
		System.out.print("0.주문종료");
	
		System.out.println();
	}
	
	public void selectMenu(int id, int quantity) {
		Tablet.getInstance().makeLineItem(foodInfoList.get(id), quantity);
	}
	
	public void orderMenu() {
		//주문정보 출력
		this.showOrderInfo();
		//POS로 주문정보 전송
		Register.getOrderList().insertOrder(order);
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