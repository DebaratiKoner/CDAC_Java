public class Order {
	int orderID;
	String orderDate;
	float orderAmount;
	Order(int orderID,String orderDate,float orderAmount){
		this.orderID = orderID;
		this.orderDate = orderDate;
		this.orderAmount = orderAmount;
		
	}
	void displayOrderDetails(){
		System.out.println("order id : " + this.orderID);
		System.out.println("order date: "+ this.orderDate);
		System.out.println("order amount: "+ this.orderAmount);
	}

}
