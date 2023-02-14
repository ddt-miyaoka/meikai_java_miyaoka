package Ensyu06_13;

import java.util.Scanner;

public class Ensyu06_13 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.print("要素数：" );
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];

		for (int i = 0; i < n; i++){
			a[i] = i;
			System.out.println("a[" + i + "i] =" + a[i]);
		}
		int c = 0;
		int d =0;
		for(int i = a.length-1; 0 <= i; i--){
			c = a[i];
			b[d] = c;
			
			System.out.println("b[" + d + "i] =" + b[d]);
			d++;
		}
	}

}
