package packone;

public class Method {

public static void a1() { //created static method.
	int a =20; int b = 30;
	System.out.println(a+b);
}
public void b1() { //created non static method
	int a =40; int b=50;
	System.out.println(a*b);
}
	public static void main(String[] args) {
		a1(); //calling static method
		Method obj = new Method();
		obj.b1(); //calling non static method
		
	}

}
