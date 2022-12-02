package javaOops;

public class Multilevel {
	public void gold(){
		System.out.println("Welth");
	}
}
class Parent extends Multilevel{
	public void mind(){
		System.out.println("Mind");
	}
}
class Child extends Parent{
	public void health(){
		System.out.println("Child is having health welth and mind");
	}


	public static void main(String[] args) {
		
		Child obj=new  Child();
		obj.gold();
		obj.mind();
		obj.health();
	}	
}	


