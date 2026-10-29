import java.util.*;

public class mx
 {
    public static void main(String[] args) 
{
        Scanner sc = new Scanner(System.in);

        int num, max;

        System.out.print("Enter number 1: ");
        max = sc.nextInt(); 

        for (int i = 2; i <= 10; i++) {
            System.out.print("Enter number " + i + ": ");
            num = sc.nextInt();

            if (num > max) {
                max = num;
            }
        }

        System.out.println("Maximum number is: " + max);

    }
}