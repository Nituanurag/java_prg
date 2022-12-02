package javaOops;

public class ClassPrg {
int a;
int b;
String c;
 ClassPrg(int height, int width, String bname){
	 a = height;
	 b = width;
	 c = bname;
	 }
 //creating method
 void button() {
	 System.out.println("Button is created with height and width and name as - "+(a)+"-"+(b)+"-"+(c));
 }
 void buttonClick() {
	 System.out.println(c +" Button is clickable");
 }
 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ClassPrg obj = new ClassPrg(20,40,"Ok");
obj.button();
obj.buttonClick();
	}

}
