package constructorJava;

public class ConsWithoutArg {
	
	int a; int b;
	ConsWithoutArg(){
		System.out.println("This is constructor");
	}
public void method() {
	System.out.println("This is Method");
}
	public static void main(String[] args) {
		ConsWithoutArg obj = new ConsWithoutArg();
		obj.method();

	}

}
