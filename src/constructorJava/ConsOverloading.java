package constructorJava;

public class ConsOverloading {
int a; int b; int c;
ConsOverloading(int m1, int m2){
	a = m1;
	b = m2;
}
ConsOverloading(int m1, int m2, int m3){
	a = m1;
	b = m2;
	c = m3;
}

void total() {
	System.out.println("Total marks in two subjects : " + (a + b));}
void perce() {
	System.out.println(("Percentage : " +(a + b)/2));
}
void total1() {
	System.out.println("Total marks in three subjects : " +(a + b + c));}
	void perce1() {
	System.out.println(("Percentage : " +(a + b + c)/3));}
	
	
	public static void main(String[] args) {
		ConsOverloading obj = new ConsOverloading(40, 50);
		
		obj.total();
		obj.perce();
		
ConsOverloading obj1 = new ConsOverloading(40, 50, 70);
		
		obj1.total1();
		obj1.perce1();
		
	}

}
