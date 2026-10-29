import java.util.*;
class onlineShopping
{
	public static void main(String args[])
	{
		double price;
		double discount;
		
	
	Scanner sc = new Scanner(System.in);

	System.out.println(" enter the price of the product :");

	price = sc.nextDouble();

	System.out.println("Enter the discount percentage : ");

	discount = sc.nextDouble();

	 
	discount = price*discount/100;

	System.out.println("discount is:" +discount );

	int payable_amount = (int)discount;
	
	double final_payable_amount = (price - discount);
	
	System.out.println("FINAL_AMOUNT " +(int)final_payable_amount);

	System.out.println("final(integer) " +payable_amount);
	}
}
	
	