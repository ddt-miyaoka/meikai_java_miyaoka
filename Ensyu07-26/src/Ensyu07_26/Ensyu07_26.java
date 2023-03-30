package Ensyu07_26;

import java.util.Scanner;

public class Ensyu07_26 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		int x = stdIn.nextInt();
		int[] a = new int[x];

		for(int i = 0; i < a.length; i++){
			a[i] = stdIn.nextInt();
		}
		int idx = stdIn.nextInt();
		int n = stdIn.nextInt();
		arrayInsOf(a, idx, n);
	}
	static int[] arrayInsOf(int[] a, int idx, int x){
		int[] b = new int[a.length+1];
		int c = 0;
		for(int i = 0; i < a.length; i++){
			if(i == idx){
				b[c] = x;
				i++;
				c++;
			}
			b[c] = a[i];
			c++;
		}
		return b;
	}
}
