package numpyNinjaProject;

public class FinalExample {

	int rollNo = 10001;
	int NoworkingDays;
	
public void mark() {
		this.rollNo = 10002;
		NoworkingDays+=1;
	}
		
public static void main(String[] args) {
		
	FinalExample f1 = new FinalExample();
	
	System.out.println("Number of working days before working : " +f1.NoworkingDays);
	f1.mark();
	f1.mark();
	f1.mark();
	f1.mark();
	f1.mark();
	System.out.println("Number of working days after working : " +f1.NoworkingDays);
	
	}

}
