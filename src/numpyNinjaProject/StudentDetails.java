package numpyNinjaProject;

public class StudentDetails {
	  float sum;
	  float avg;
	  
public float student(float a, float b, float c, float d) {
		sum = a+b+c+d;
		return sum;
	}
	
public float studentAvg(float sum) {
		avg = sum/4; 
		return avg;
	}
	public static void main(String[] args) {
		
		StudentDetails obj1 = new StudentDetails();
		StudentDetails obj2 = new StudentDetails();
		StudentDetails obj3 = new StudentDetails();
		StudentDetails obj4 = new StudentDetails();
	    
		float sum =  obj1.student(90, 70, 80, 95);
		float sum1 = obj2.student(70, 88, 87, 94);
		float sum2 = obj3.student(69, 78, 89, 85);
		float sum3 = obj4.student(90, 80, 90, 85);
		
		StudentDetails objavg1 = new StudentDetails();
		StudentDetails objavg2 = new StudentDetails();
		StudentDetails objavg3 = new StudentDetails();
		StudentDetails objavg4 = new StudentDetails();
		
		float avg  =  objavg1.studentAvg(sum);
		float avg1 =  objavg2.studentAvg(sum1);
		float avg2 =  objavg3.studentAvg(sum2);
		float avg3 =  objavg4.studentAvg(sum3);
	    
		System.out.println("Student 1 four subject total marks : "+sum);
		System.out.println("          And average marks : "+avg);
		
		System.out.println("Student 2 four subject total marks : "+sum1);
		System.out.println("          And average marks : "+avg1);
		
		System.out.println("Student 3 four subject total marks : "+sum2);
		System.out.println("          And average marks : "+avg2);
		
		System.out.println("Student 4 four subject total marks : "+sum3);
		System.out.println("          And average marks : "+avg3);
		
}

}
