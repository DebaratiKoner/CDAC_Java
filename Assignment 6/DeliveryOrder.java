import java.util.Scanner;
public class DeliveryOrder extends Order{
	String deliveryAdd;
	float deliveryChar;
	int deliveryDays;
	DeliveryOrder(int orderID,String orderDate,float orderAmount,String deliveryAdd,float deliveryChar,int deliveryDays){
		super(orderID,orderDate,orderAmount);
		this.deliveryAdd = deliveryAdd;
        this.deliveryChar = deliveryChar;
        this.deliveryDays = deliveryDays;
	}
	float TotalAmount() {
		return this.orderAmount + this.deliveryChar;
	}
	void displayDeliveryDetails() {
		this.displayOrderDetails();
	
	System.out.println("delivery Address: "+ this.deliveryAdd);
	System.out.println("delivery charges: "+ this.deliveryChar);
	System.out.println("delivery Days: "+ this.deliveryDays);
	System.out.println("Total payable amount: "+ this.TotalAmount());
}
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the order id: ");
	int orderID = sc.nextInt();
	sc.nextLine();
	System.out.println("Enter the order date: ");
	String orderDate = sc.nextLine();
	System.out.println("Enter the order amount: ");
	float orderAmount = sc.nextFloat();
	sc.nextLine();
	System.out.println("Enter the delivery address: ");
	String deliveryAdd = sc.nextLine();
	System.out.println("Enter the delivery charges: ");
	float deliveryChar = sc.nextFloat();
	System.out.println("Enter the delivery Days: ");
	int deliveryDays = sc.nextInt();
	
	DeliveryOrder d = new DeliveryOrder(orderID,orderDate,orderAmount,deliveryAdd,deliveryChar,deliveryDays);
	d.displayDeliveryDetails();
	sc.close();
	}	
}
