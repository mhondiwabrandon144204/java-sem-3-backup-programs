
import java.util.Scanner;

class RentalVehicle {
    static int service_charge = 200;
    String vehicle_details;
    float daily_rental_rate;

    RentalVehicle(String vehicle_details, float daily_rental_rate) {
        this.vehicle_details = vehicle_details;
        this.daily_rental_rate = daily_rental_rate;
    }

    public void display() {
        System.out.println("Vehicle details: " + vehicle_details);
        System.out.println("Rental rate: " + daily_rental_rate);

        double total_rental_charge = service_charge + daily_rental_rate;
        System.out.println("Total rental charge: " + total_rental_charge);
    }
}

class rental {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the type of the first vehicle:");
        String vehicle_details1 = sc.nextLine();

        System.out.println("Enter the daily rental rate:");
        float daily_rental_rate1 = sc.nextFloat();
        sc.nextLine();

        System.out.println("Enter the type of the second vehicle:");
        String vehicle_details2 = sc.nextLine();

        System.out.println("Enter the daily rental rate:");
        float daily_rental_rate2 = sc.nextFloat();

        RentalVehicle r1 = new RentalVehicle(
            vehicle_details1, daily_rental_rate1
        );

        RentalVehicle r2 = new RentalVehicle(
            vehicle_details2, daily_rental_rate2
        );

        r1.display();
        r2.display();

        
    }
}
