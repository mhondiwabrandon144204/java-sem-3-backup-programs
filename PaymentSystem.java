import java.util.Scanner;


interface PaymentMethod {
void processPayment(double amount);
}


class UPIPayment implements PaymentMethod {
private String upiId;

public UPIPayment(String upiId) {
this.upiId = upiId;
}


public void processPayment(double amount) {
System.out.println("\nProcessing UPI payment of $`" + amount + " for UPI ID: " + upiId + "...");
System.out.println("Transaction Status: SUCCESSFUL!");
}
}


class CreditCardPayment implements PaymentMethod {
private String cardNumber;

public CreditCardPayment(String cardNumber) {
this.cardNumber = cardNumber;
}


public void processPayment(double amount) {
System.out.println("\nProcessing Credit Card payment of `$" + amount + " for Card ending in "
+ cardNumber.substring(Math.max(0, cardNumber.length() - 4)) + "...");
System.out.println("Transaction Status: SUCCESSFUL!");
}
}


public class PaymentSystem {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.print("Enter payment amount: ");
double amount = scanner.nextDouble();

System.out.println("\nSelect Payment Method:");
System.out.println("1. UPI");
System.out.println("2. Credit Card");
System.out.print("Enter choice (1 or 2): ");
int choice = scanner.nextInt();
scanner.nextLine(); // consume newline

PaymentMethod payment = null;

switch (choice) {
case 1:
System.out.print("Enter UPI ID: ");
String upiId = scanner.nextLine();
payment = new UPIPayment(upiId);
break;
case 2:
System.out.print("Enter 16-digit Credit Card Number: ");
String cardNumber = scanner.nextLine();
payment = new CreditCardPayment(cardNumber);
break;
default:
System.out.println("\nInvalid payment method selected.");
scanner.close();
return;
}


payment.processPayment(amount);

scanner.close();
}
}
