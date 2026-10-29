import java.util.*;
class printname
{
	public static void main(String args[])
	{
	Scanner m = new Scanner(System.in);
	
	String name;
	System.out.print("Enter your name : ");
	name = m.nextLine();

	for(int i=1;i<=4;i++)
	{
	System.out.println(name + " " + i);
	}
}
}