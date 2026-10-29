import java.util.*;
public class info
{
 	public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter your fullname. ");
	String name = sc.nextLine();
	String[] words = name.split("");
	System.out.print("initials: ");
	for(String word: words)
{
	if(!word.isEmpty())
 {
	System.out.println(Character.toUpperCase(word.charAt(0)));
}
}
	
	
	}
}
	