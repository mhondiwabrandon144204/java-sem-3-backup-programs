import java.util.Scanner;
class test
{
	public static void main(String args[])
	{
		int a,b,sum;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 1st no.");
		a=s.nextlnt();
		System.out.println("Enter 2nd no.");
		b=s.nextlnt();
		sum = a+b;
		System.out.println("total is"+ sum);
}
}