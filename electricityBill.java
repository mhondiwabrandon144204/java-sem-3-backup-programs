import java.util.*;
class electricityBill
{
	public static void main(String args[])
	{
		int units;
		int bill;
		int hours;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of units consumed : ");
		units=sc.nextInt();
		System.out.println("Enter the number of hours : ");
		hours=sc.nextInt();
		bill=units*hours;
		System.out.println(" the bill is : "+bill);
		
		
	}
}
		
		
		