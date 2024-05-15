import java.util.ArrayList;
import java.util.Scanner;
	public class ECommerce2{
	public static void main(String[] args){

	Scanner scanner = new Scanner(System.in);
	
	//c9ArrayList<Integer > quantities = new ArrayList<>();
	ArrayList<Double > quantities = new ArrayList<>();
	ArrayList<Double > prices = new ArrayList<>();
	ArrayList<String > goods = new ArrayList<>();
	ArrayList<Double > total = new ArrayList<>();
	

	String customerName = ""; 
	String goodsBought = "";
	double pieces = 0.0;
	double pricePerUnit = 0.0;
	String addItems = "";
        System.out.println("What is the Customer's Name: ");
	customerName = scanner.next();
	while(!addItems.equalsIgnoreCase("no")){
		System.out.println("What did the user buy: ");
		goodsBought = scanner.next();
		goods.add(goodsBought);
		System.out.println("How many pieces: ");
		pieces = scanner.nextDouble();
		quantities.add(pieces);
		System.out.println("How much per unit: ");
		pricePerUnit = scanner.nextDouble();
		prices.add(pricePerUnit);
		System.out.println("Add more items: ");
		addItems= scanner.next();
		}


System.out.println("What is cashier name?: ");
String name = scanner.next();
System.out.println("How much discount will he get: ");
double discount = scanner.nextDouble();
		double vat = 0.0;
		double discountAmount = 0.0;
		double billTotal = 0.0;
		double totalSum = 0.0;
		double balance = 0.0;
		double sum = 0.0;
		

	for(int count = 0; count < quantities.size(); count++){ 
		total.add(quantities.get(count) * prices.get(count));
		sum += total.get(count);
		
	}
	for(int counter = 0; counter < quantities.size(); counter++){ 
		totalSum += quantities.get(counter) *  prices.get(counter);
	 }
	//for(int count1 = 0; count1 < quantities.size(); count1++){
		//total.add = total + goods.get(count1);
	//}
	discount = 7.50 * sum / 100;
	discountAmount = discount * sum / 100;
	vat = sum * 7.50 / 100;
	billTotal = sum - discountAmount + vat;
	System.out.println("How much did the customer give to you?: ");
	double amountPaid = scanner.nextDouble();

	balance = amountPaid - billTotal;

	System.out.println("SEMICOLON STORES");
	System.out.println("MAIN BRANCH");
	System.out.println("Location: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.");
	System.out.println("Tel: 03293828343");
	System.out.println("Date: 18-Dec-22 8:43:11 pm");
	System.out.println("Cashier: " + name);
	System.out.println("Customer Name: " + customerName);
	System.out.printf("ITEM		QTY	   PRICE	TOTAL(NGN) %n");
	
	System.out.println("****************************************");
	System.out.printf("%10s %10s %10s %10s%n","goods","quantity","prices","total");
	System.out.println("----------------------------------------");
	for (int count = 0; count < quantities.size(); count++){
	System.out.printf("	%s	%.2f   	%.2f     %.2f %n",goods.get(count),quantities.get(count), prices.get(count) , total.get(count));
	}
	System.out.println("****************************************");
	
	System.out.printf("%10s %10s %10s %10s %10s %10s %n", "vat@" , "billTotal" , "Balance", "totalSum" , "discount" , "Amount Paid");
	System.out.printf("    %.2f    %.2f     %.2f     %.2f	 %.2f	%.2f %n", vat, billTotal, balance, sum, discount, amountPaid); 

	System.out.println("Thank You For Your Patronage");









}

}