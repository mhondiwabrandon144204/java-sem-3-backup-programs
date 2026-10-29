class Book
{
	String title;
	double price;

 	Book(String title,double price)
		{
			this.title = title;
			this.price = price;

			System.out.println("the title is :" +title);
			System.out.println("the price is :" +price);

		}
	
}
public class Main3
{
	public static void main(String args[])

	{
		Book b1 = new Book("richest man",30.42);
		Book b2 = new Book("think and grow",50.35);


	}
}

