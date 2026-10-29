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
		float disc_amt = price*discouned_perc/100;

		float new_price=price-disc_amt;
		System.out.println("Discounted price" + new_price);
	}
}
class test
{
	public static void main(String args[])
	{
		Product p = new Product(1,"abc",100,5)
		p.display();
	}
}	
/*
	double discounted_price;
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the product ID : ");
	product_ID = sc.nextlnt();
	System.out.println("Enter the price : ");
	price = sc.nextlnt();
	System.out.println("Enter the discounted percentage:");
	discounted_perc = sc.nextDouble();
	discounted_price = price - price * (discounted_perc/100.0);
	
	System.out.println("the discounted" +discounted_price);
	double final_price = price - discounted_price;
	
	System.out.println("FINALE" +final_price);
	}
	sc.close();
}
}*/

	
	