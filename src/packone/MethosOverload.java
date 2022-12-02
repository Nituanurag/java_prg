package packone;

public class MethosOverload {
 public static void opensheet(String sname) {
	 System.out.println("Sheet "+sname+" opened successfully");
 }
 public static void opensheet(int sno) {
	 System.out.println("sheet "+sno+" opensheet");
}
	public static void main(String[] args) {
	opensheet("sheet24");
	opensheet("abcd");
	opensheet(56);
	opensheet("xyz");
	opensheet(78);
	}

}
