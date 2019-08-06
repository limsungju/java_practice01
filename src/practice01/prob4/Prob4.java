package practice01.prob4;

import java.util.Scanner;

public class Prob4 {
	public static void main (String args[]) {
		String data2="";
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력하세요. : ");
		String str = sc.nextLine();
		
		for(int i=0; i<str.length(); i++) {
			String data = str.substring(i, (i+1));
			data2 = data2 + data;
			System.out.println(data2);
		}
		sc.close();
	}
}
