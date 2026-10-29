import java.util.scanner;

class Vehicle
{
	

	String registration_number;
	String brand;




	Vehicle(String registration_number,String brand)

	{
		this.registration_number = registration_number;
		this.brand = brand;
	}

	public void display()
	{
		System.out.println("kind of car");
		System.out.println("kind of motorcycle");
		System.out.println("registration_number" +registration_number);
		System.out.println("brand" +brand);

	}

	calculate rental()
	{
		//System.out.println("Enter the brand of car you want to rent:");
		
	}

       class car extends Vehicle
		{
		}
	class motorcycle extends car
		{
			
		}
}

class motor
{
	static int perday = 100;


	public static void main(String args[])
	{

	
	
	String registration_number;
	String brand;

	Scanner sc = new Scanner(System.in);

	System.out.println("Enter the rentaldays :");
	int days = sc.nextInt();
	double rental_charges = days * perday;

	System.out.println("Total amount :" +rental_charges);




	motorcycle m1 = new motorcycle("MS1110","ducatti");
	car c1 = new car("AA2003","LANDROVER");
	}
}
	

	

	


