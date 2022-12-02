package looping;

public class NestedFor {

	public static void main(String[] args) {
		System.out.println("i "+"j "+"k ");
		int i;
		for(i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				//System.out.println(i+"-" +j);
				for(int k = 0; k<3; k++) {
					System.out.println(i +"-"+ j +"-"+ k);
				}
			}
		}

	}

}
