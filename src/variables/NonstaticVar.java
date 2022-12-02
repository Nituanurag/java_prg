package variables;

public class NonstaticVar {

	public  int a = 20;//declared nonstaticvariable
	public  int b = 30;
	public static void main(String[] args) {
		
		NonstaticVar n=new NonstaticVar(); //created object
		System.out.println(n.a*n.b);
		System.out.println(n.a+n.b);
	}

}
