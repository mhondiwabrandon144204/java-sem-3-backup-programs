class Appointment
{
	String patientname;
	String doctorname;
	String Apptime;

	Appointment(String patientname,String doctorname,String Apptime)
	{
		this.patientname = patientname;
		this.doctorname = doctorname;
		this.Apptime = Apptime;
	}
	

	public void display()
	{
		System.out.println("Patient name :" +patientname);
		System.out.println("Doctorname :" +doctorname);
		System.out.println("Appointment time: " +Apptime);
	}
}
class test1
{
	public static void main(String args[])
	{
		Appointment a1 = new Appointment("gerald","Dr Scott","11:30am");
		a1.display();
		Appointment a2 = new Appointment("Chikwanda","Dr Mhondiwa","14:30pm");
		a2.display();
	}
}
