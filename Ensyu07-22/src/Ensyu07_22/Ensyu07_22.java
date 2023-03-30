package Ensyu07_22;

import java.util.Scanner;

public class Ensyu07_22 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		int x = stdIn.nextInt();
		int[] a = new int[x];
		for(int i = 0; i < a.length; i++){
			a[i] = stdIn.nextInt();
		}
		arrayClone(a);
	}
	static int[] arrayClone(int[] a){
		int[] b = new int[a.length];
		for(int i = 0; i < a.length; i++){
			b[i] = a[i];
		}
		return b;
	}
}
