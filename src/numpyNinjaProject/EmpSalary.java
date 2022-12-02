package numpyNinjaProject;

public class EmpSalary {

	public double Monthlysalary(double basic, double boa, double bonus) {
		double pf=basic*(0.12);
		double monthlysalary=(basic+boa+bonus)-pf;
		return monthlysalary;
		
	}
	
	public double calcAnnualsal(double monthlysalary )
	{
		double empAnnualNetSal = monthlysalary * 12;
		return empAnnualNetSal;
	
	}
	public double calcTaxEmployee(double empAnnualNetSal)
	
	{	
		double tax_deducted = 0;
		if(empAnnualNetSal < 250000)
		{
			 tax_deducted =0;
		}	
		else if((empAnnualNetSal > 250000) && (empAnnualNetSal<=500000)) 
		{
			
			 tax_deducted = (empAnnualNetSal * 0.05)/12;		
		}	
		else if(empAnnualNetSal>500000 && empAnnualNetSal<=1000000)
		{
			 tax_deducted = (empAnnualNetSal*0.20)/12;
		}
		else if(empAnnualNetSal>1000000 && empAnnualNetSal<=1500000)
		{
			 tax_deducted = (empAnnualNetSal*0.30)/12;
		}
		return tax_deducted;		
	}

	public static void main(String[] args) {
		EmpSalary B1 = new EmpSalary();
		double monthlysalary = B1.Monthlysalary(7000, 5000, 2000);
		double empAnnualNetSal = B1.calcAnnualsal(monthlysalary);
		double Taxdeducted = B1.calcTaxEmployee(empAnnualNetSal);
		
		
        System.out.println("Emplyoeer level 1 deatils are below:");
		System.out.println("Emplyoee monthly salary is " + monthlysalary);
		System.out.println("Emplyoee  annual salary is " + empAnnualNetSal);
		System.out.println("Emplyoee tax deducted per month is " + Taxdeducted);
		System.out.println("Emplyoee monthly take home salary is " + (monthlysalary - Taxdeducted));
		System.out.println("\n");

		EmpSalary B2 = new EmpSalary();
		monthlysalary = B2.Monthlysalary(10000, 7000, 2500);
		empAnnualNetSal = B2.calcAnnualsal(monthlysalary);
		Taxdeducted = B2.calcTaxEmployee(empAnnualNetSal);

		System.out.println("Emplyoeer level 2 deatils are below:");
		System.out.println("Emplyoee monthly salary is " + monthlysalary);
		System.out.println("Emplyoee annual salary is " + empAnnualNetSal);
		System.out.println("Emplyoee tax deducted per month is " + Taxdeducted);
		System.out.println("Emplyoee monthly take home salary is " + (monthlysalary - Taxdeducted));
		System.out.println("\n");
		
		EmpSalary B3 = new EmpSalary();
		monthlysalary = B3.Monthlysalary(12000, 9000, 3000);
		empAnnualNetSal = B3.calcAnnualsal(monthlysalary);
		Taxdeducted = B3.calcTaxEmployee(empAnnualNetSal);

		System.out.println("Emplyoeer level 3 deatils are below:");
		System.out.println("Emplyoee monthly salary is " + monthlysalary);
		System.out.println("Emplyoee annual salary is " + empAnnualNetSal);
		System.out.println("Emplyoee tax deducted per month is " + Taxdeducted);
		System.out.println("Emplyoee monthly take home salary is " + (monthlysalary - Taxdeducted));
		System.out.println("\n");

		EmpSalary B4 = new EmpSalary();
		monthlysalary = B4.Monthlysalary(15000, 10000, 3500);
		empAnnualNetSal = B4.calcAnnualsal(monthlysalary);
		Taxdeducted = B4.calcTaxEmployee(empAnnualNetSal);

		System.out.println("Emplyoeer level 4 deatils are below:");
		System.out.println("Emplyoee monthly salary is " + monthlysalary);
		System.out.println("Emplyoee annual salary is " + empAnnualNetSal);
		System.out.println("Emplyoee tax deducted per month is " + Taxdeducted);
		System.out.println("Emplyoee monthly take home salary is " + (monthlysalary - Taxdeducted));
		System.out.println("\n");
		
	}

}
