package practice01.prob2;

public class Prob2 {
	public static void main (String args[]) {
		int num = 0;
		
		for(int i=0; i<9; i++) {
			for(int j=1; j<11; j++) {
				num = i + j;
				System.out.print(num + " ");
			}
			System.out.println();
		}
		
	}
}
