package Ensyu07_02;

import java.util.Scanner;

public class Ensyu07_02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		int c = stdIn.nextInt();

		int min = min(a,b,c);
	}
	static int min(int a, int b, int c){
		int min = a;
		if(min > b){
			min = b;
		}
		if(min > c){
			min = c;
		}
		return min;
	}
}
