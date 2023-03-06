package Ensyu07_12;

import java.util.Scanner;

public class Ensyu07_12 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		int x = stdIn.nextInt();
		int n = stdIn.nextInt();
		rRotate(x,n);
		lRotate(x,n);
	}

	static void printBits(int x) {
	    for (int i = 31; i >= 0; i--){
	      System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
	    }
	}

	static int rRotate(int x, int n){
		int a = 0;
		a = x >>> n;
		x = x << 32 -n;
		x = x | a;
		return x;
	}

	static int lRotate(int x, int n){
		int a = 0;
		a = x << n;
		x = x >>> 32 -n;
		x = x | a;
		return x;
	}
}
