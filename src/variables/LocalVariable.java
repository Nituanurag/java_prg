package variables;

public class LocalVariable {

	public static void a1() {
		int a = 20; int b = 30;
		System.out.println(a*b);
	}
	public static void a2() {
		int a = 50; int b = 50;
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		a1();
		a2();

	}

}
