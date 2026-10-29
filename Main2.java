


class SalaryCalculator
{
	double basic_salary;
	double allowance,bonus;
	double calculatesalary;


	 calculatesalary(double basic_salary)
	{
		return basic_salary;

	}

	 calculatesalary(double basic_salary,double allowance)

	{

		return  basic_salary + allowance;
	}

	calculatesalary(double basic_salary,double allowance,double bonus)
	{
		return basic_salary  + allowance + bonus;

	}
}

public class Main2
{
public static void main(String args[])
{
	SalaryCalculator Sc = new SalaryCalculator();
			

	System.out.println(Sc.calculatesalary(2000));

        System.out.println(Sc.calculatesalary(5000, 1000));

        System.out.println(Sc.calculatesalary(5000, 1000, 500));
    }

			
			
}

				
	


	