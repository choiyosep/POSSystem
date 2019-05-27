package POSSystem;

public class FoodCourt {

	private OrderList orderList;
	private Menu menu;
	FoodCourt(){
		setOrderList(new OrderList());
		setMenu(new Menu());
	}

	public OrderList getOrderList() {
		return orderList;
	}
	
	public void setOrderList(OrderList orderList) {
		this.orderList = orderList;
	}

	public Menu getMenu() {
		return menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}
}
