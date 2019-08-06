package practice01.prob5;

public class Prob5 {
	public static void main (String args[]) {
		
		for(int i=1; i<100; i++) {
			int s1 = i/10; // 10자리
			int s2 = i%10; // 1자리
			
			if(s1==3 || s1==6 || s1==9 || s2==3 || s2==6 || s2==9) {
				System.out.print(i + " ");
				if(s1==3 || s1==6 || s1==9) {
					System.out.print("짝");
				}
				if(s2==3 || s2==6 || s2==9) {
					System.out.print("짝");
				}
				System.out.println();
			}
			
			
		}
	}
}
