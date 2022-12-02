package javaOops;

public class SingleInheritance {
	public void base_class() 
	{
	System.out.println("Base Class");
	}
}
class Child_class extends SingleInheritance{
	public void gold(){
		System.out.println("Child class method gold");	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child_class obj = new Child_class();
		obj.base_class();
		obj.gold();
	}

}
