import java.util.*;
class studentResult
{
 	public static void main(String args[])
	{
		int mark1,mark2,mark3,total,percentage;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter mark 1: ");
		mark1 = sc.nextInt();
		System.out.println("Enter mark 2: ");
		mark2 = sc.nextInt();
		System.out.println("Enter mark 3: ");
		mark3 = sc.nextInt();
		total = mark1 + mark2 + mark3;
		System.out.println("the total is :" +total);
		percentage = total/100;
		System.out.println("the percentage is :" +percentage);
		
		if(mark1>40)
		{
			System.out.println("student passed");
		}
		else if(mark2 > 40)
		{
			System.out.println("student passed");
		}
		else if(mark3 > 40)
		{
 			System.out.println("student passed");
		}
		else
		{
			System.out.println("student failed");
		}
	}
}
			
			
		



