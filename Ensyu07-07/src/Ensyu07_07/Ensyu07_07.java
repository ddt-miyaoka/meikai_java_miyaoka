package Ensyu07_07;

import java.util.Scanner;

public class Ensyu07_07 {

		static void putChars(char c, int n){
			while(n-- > 0){
				System.out.print(c);
			}
		}
		
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		
		for(int i = 1; i <=  n; i++){
			putChars('a',i);
			System.out.println();
		}
	}

}
