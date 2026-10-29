import java.util.*;
public class compare
{
	public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter firstname: ");
	String name1 = sc.nextLine();
	System.out.print("Enter secondname: ");
	String name2 = sc.nextLine();
	
	if(name1.equals(name2))
{
	System.out.println("both names are equal.");
}
	else
{
	System.out.println("both names are not equal.");
}
}
}