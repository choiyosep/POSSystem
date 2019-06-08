package POSSystem;

import java.util.ArrayList;

public class CalculateSale {
	
	private static int calculateSale = 0;

	
	public void calculate(OrderList orderList, ArrayList<Refund> refundList) {
		
		int totalOrderPrice = 0;
		int totalRefundPrice = 0;
		ArrayList<Order> oList = orderList.getOrderLists();
		for(int i=0; i<oList.size(); i++)
			totalOrderPrice+=oList.get(i).getTotal();
		
		System.out.println("=====���� ���====");
		System.out.println("�� �ֹ� �ݾ�:"+ totalOrderPrice);
		
		for(int i=0; i<refundList.size(); i++)
			totalRefundPrice+=refundList.get(i).getRefundPrice();
		System.out.println("�� ȯ�� �ݾ�:"+ totalRefundPrice);
		System.out.println("�� �Ǹűݾ� : "+totalOrderPrice+"�� - "+totalRefundPrice+"�� = "+ (totalOrderPrice-totalRefundPrice)+"��" );
		System.out.println("======���� �Ϸ�=====");
		}

	public int getCalculateSale() {
		return calculateSale;
	}

	public void setCalculateSale(int calculateSale) {
		CalculateSale.calculateSale = calculateSale;
	}

}
