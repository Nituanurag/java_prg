package numpyNinjaProject;

public class TakeHomeSalary 
{
	static int Emp_lvl=0;
	double basic_pay =0;
	double boa=0;
	double bonus=0;
	double pf=0;
	double netMonthlySalary=0;
	double yearly_salary=0;
	double tax_slab=0;
	static double sum_taxrate=0;
	double new_taxrate=0;
	
	
	public double EmpMonthlySalary(double basic_pay,double boa,double bonus) {
		pf = basic_pay *(0.12);
		double netMonthlySalary = (basic_pay+boa+bonus)-pf;
		return(netMonthlySalary);
	}
	
	public double AnualSalary(double netMonthlySalary) {
		yearly_salary = netMonthlySalary * 12;
		return(yearly_salary);
	}
	
	public double calculateTax(double yearly_salary) 
	{
		
		if (yearly_salary < 250000) {
			tax_slab = 0;
		}
		else if((yearly_salary >= 250000) && (yearly_salary <=500000)){
			tax_slab = (yearly_salary * 0.05)/12;
		}
		else if((yearly_salary >= 500000) && (yearly_salary <=750000)){
			tax_slab 	= (yearly_salary * 20)/12;
			new_taxrate = (yearly_salary * 10)/12;
			sum_taxrate = (yearly_salary * 20)/12 + (yearly_salary * 10)/12;
			
		}
		else if((yearly_salary >= 750000) && (yearly_salary <=1000000)){
			tax_slab 	= (yearly_salary * 20)/12;
			new_taxrate = (yearly_salary * 15)/12;
			sum_taxrate = tax_slab + new_taxrate;
		}
		else if((yearly_salary >= 1000000) && (yearly_salary <=1250000)){
			tax_slab 	= (yearly_salary * 30)/12;
			new_taxrate = (yearly_salary * 20)/12;
			sum_taxrate = tax_slab + new_taxrate;
		}
		else if((yearly_salary >= 1250000) && (yearly_salary <=1500000)){
			tax_slab = (yearly_salary * 30)/12;
			new_taxrate = (yearly_salary * 25)/12;
			sum_taxrate = tax_slab + new_taxrate;
		}
		else if(yearly_salary >=1500000){
			tax_slab = (yearly_salary * 30)/12;
			new_taxrate = (yearly_salary * 30)/12;
			sum_taxrate = tax_slab + new_taxrate;
		}
		return (tax_slab);
	}
    public static void main(String[] args) {
    	TakeHomeSalary objEmp1 	= new TakeHomeSalary();
    	double netMonthlySalary = objEmp1.EmpMonthlySalary(7000, 5000, 2000);
    	double yearly_salary 	= objEmp1.AnualSalary(netMonthlySalary);
    	double tax_slab 	 	= objEmp1.calculateTax(yearly_salary);
    	
    	System.out.println("Level 1 Employee details");
    	System.out.println("Employee monthly salary is : "+netMonthlySalary );
    	System.out.println("Employee anual salary is : "+yearly_salary );
    	System.out.println("Employee tax deducted per month is : "+tax_slab );
    	System.out.println("\n");
    	
    	TakeHomeSalary objEmp2 = new TakeHomeSalary();
    	netMonthlySalary 	   = objEmp2.EmpMonthlySalary(10000, 7000, 2500);
    	yearly_salary 		   = objEmp2.AnualSalary(netMonthlySalary);
    	tax_slab 	   		   = objEmp2.calculateTax(yearly_salary);
    	
    	System.out.println("Level 2 Employee details");
    	System.out.println("Employee Monthly salary is : "+netMonthlySalary );
    	System.out.println("Employee Anual salary is : "+yearly_salary );
    	System.out.println("Employee Tax deducted per month is : "+tax_slab );
    	System.out.println("\n");
    	
    	
    	TakeHomeSalary objEmp3 = new TakeHomeSalary();
    	netMonthlySalary 	   = objEmp3.EmpMonthlySalary(12000, 9000, 3000);
   	 	yearly_salary		   = objEmp3.AnualSalary(netMonthlySalary);
   	 	tax_slab 	   		   = objEmp3.calculateTax(yearly_salary);
   	    sum_taxrate 	   	   = objEmp3.calculateTax(yearly_salary);
    	
    	System.out.println("Level 3 Employee details");
    	System.out.println("Employee Monthly salary is : "+netMonthlySalary);
    	System.out.println("Employee Anual salary is : "+yearly_salary );
    	System.out.println("Employee Tax deducted per month is : "+tax_slab );
      	System.out.println("\n");
    	
    	
    	TakeHomeSalary objEmp4 = new TakeHomeSalary();
    	netMonthlySalary 	   = objEmp4.EmpMonthlySalary(15000, 10000, 3500);
   	 	yearly_salary 		   = objEmp4.AnualSalary(netMonthlySalary);
   	 	tax_slab 	   		   = objEmp4.calculateTax(yearly_salary);
    	
    	System.out.println("Level 4 Employee details");
    	System.out.println("Employee Monthly salary is : "+netMonthlySalary );
    	System.out.println("Employee Anual salary is : "+yearly_salary );
    	System.out.println("Employee Tax deducted per month is : "+tax_slab );
    	System.out.println("\n");
	}
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		