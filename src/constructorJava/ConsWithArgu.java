package constructorJava;

public class ConsWithArgu {
	int a; int b;
	
	ConsWithArgu(int m1, int m2){
		a = m1;
		b = m2;
		}
	
void total() {
	System.out.println("Total Marks in two subjects : " + (a + b));
}
void perce() {
	System.out.println(("Percentage : "+(a + b) / 2));
}
	public static void main(String[] args) {
		ConsWithArgu obj = new ConsWithArgu(50,60);
		obj.total();
		obj.perce();
		
		ConsWithArgu obj1 = new ConsWithArgu(80,90);
		obj1.total();
		obj1.perce();
				
	}

}
