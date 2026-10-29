import java.util.Scanner;
class Product
{
	int product_ID;
	String product_name;
	double price;
	double discounted_perc;

	Product(int product_ID,String product_name,double price,double discounted_perc)
	{
		this.product_ID=product_ID;
		this.product_name=product_name;
		this.price=price;
		this.discounted_perc=discounted_perc;
	}

	public void display()
	{
		System.out.println("Product id"+product_ID);
		System.out.println("Name " +product_name);
		System.out.println("Actual Price" + price);
		double disc_amt = price*discounted_perc/100;

		double new_price=price-disc_amt;
		System.out.println("Discounted price" + new_price);
	}
}
class test
{
	public static void main(String args[])
	{
		int product_ID;
		String product_name;
		double price;
		double discounted_perc;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the product ID : ");
		product_ID = sc.nextInt();

		sc.nextLine();
	

		System.out.println("Enter the product name : ");
		product_name = sc.nextLine();

		System.out.println("Enter the price : ");
		price = sc.nextInt();
	
		System.out.println("Enter the discounted percentage:");
		discounted_perc = sc.nextDouble();

		Product p = new Product(product_ID,product_name,price,discounted_perc);
		p.display();
	}
}	