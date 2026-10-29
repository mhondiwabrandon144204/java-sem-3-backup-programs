import java.util.*;
class marks
{
	public static void main(String args[])
{
	int sub1,sub2,sub3,total;
	float percentage;
	Scanner s = new Scanner(System.in);
	System.out.println("enter sub1 marks.");
	sub1 = s.nextInt();
	System.out.println("enter sub2 marks.");
	sub2 = s.nextInt();
	System.out.println("enter sub3 marks.");
	sub2 = s.nextInt();
	percentage = (sub1 + sub2 + sub3)/100;
	System.out.println("the percentage is." +percentage );
	total = sub1 + sub2 + sub3;
	System.out.println("the total is." +total);
	
	
	if((sub1<sub2) && (sub1<sub3)&&())
	{
		System.out.println("sub1 is max");
	}
		else if(sub2<sub3)
	{
		System.out.println("sub2 is max");
	}
		else
	{
		System.out.println("sub3 is max");
	}
	
}
}	
	