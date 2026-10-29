
class Student
{
	int roll_number;
	String name;
	double marks;
	
	Student( int roll_number,String name,double marks)
	{
		
		this.roll_number = roll_number;
		this.name = name;
		this.marks=marks;
		
	}
	public void display()
	{
		System.out.println("The roll number is : " + roll_number);
		System.out.println("The name is : " + name);
		System.out.println("The marks is : " + marks);
	}

}
public class Main
{
	public static void main(String args[])
	{
		Student r1 = new Student(001,"Brandon",98);
		Student r2 = new Student(002,"scott",99);
		Student r3 = new Student(003,"Mhondiwa",100);

		r1.display();
		r2.display();
		r3.display();
	}
}
	