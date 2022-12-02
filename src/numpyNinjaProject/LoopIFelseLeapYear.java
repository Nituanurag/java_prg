package numpyNinjaProject;

public class LoopIFelseLeapYear {
	
	public void LeapYear() {
		
		int i;
		for (i = 2000; i <= 2100; i++)
		{
			
			if(i%4==0) {
				System.out.println("This is leap year : "+i);
				
			}	
		}	
	}

	public static void main(String[] args) {
		LoopIFelseLeapYear obj = new LoopIFelseLeapYear();
		obj.LeapYear();

	}

}
