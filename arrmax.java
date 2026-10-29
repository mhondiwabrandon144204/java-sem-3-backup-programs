import java.util.*;
class arrmax
{
	public static void main(String args[])
{
		int i;
		Scanner sc = new Scanner(System.in); 
		System.out.print("enter the values : ");
		int max=10;
		
		for(i=1;i<=10;i++)
		{
			System.out.println("the value are " + i +":");
			int currentNumber = sc.nextlnt();
		}
		      if(currentNumber > max)
			{
				max = currentNumber;
			}
		System.out.println( "max num is" + max);
}
}