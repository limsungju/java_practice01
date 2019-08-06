package practice01.prob3;

import java.util.Scanner;

public class Prob3 {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
		
		int num = sc.nextInt();
		
		int val = 0;
		
		
		if(num%2==0) {
			for(int i=2; i<=num; i++) {
				if(i%2==0) {
					val = val + i;
				}
			}
			System.out.println("결과 값 : " + val);
		} else {
			for (int j=1; j<=num; j++) {
				if(j%2!=0) {
					val = val + j;
				}
			}
			System.out.println("결과 값 : " + val);
		}
		
		
	}
}
