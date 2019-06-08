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
		
		System.out.println("=====정산 결과====");
		System.out.println("총 주문 금액:"+ totalOrderPrice);
		
		for(int i=0; i<refundList.size(); i++)
			totalRefundPrice+=refundList.get(i).getRefundPrice();
		System.out.println("총 환불 금액:"+ totalRefundPrice);
		System.out.println("총 판매금액 : "+totalOrderPrice+"원 - "+totalRefundPrice+"원 = "+ (totalOrderPrice-totalRefundPrice)+"원" );
		System.out.println("======정산 완료=====");
		}

	public int getCalculateSale() {
		return calculateSale;
	}

	public void setCalculateSale(int calculateSale) {
		CalculateSale.calculateSale = calculateSale;
	}

}
