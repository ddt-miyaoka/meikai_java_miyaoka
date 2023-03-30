package Ensyu07_21;

import java.util.Scanner;

public class Ensyu07_21 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		System.out.println("一つ目の配列の要素数：");
		int x = stdIn.nextInt();
		System.out.println("二つ目の配列の要素数：");
		int y = stdIn.nextInt();
		int[] a = new int[x];
		int[] b = new int[y];

		for(int i = 0; i < a.length; i++){
			a[i] = stdIn.nextInt();
		}
		for(int i = 0; i < b.length; i++){
			b[i] = stdIn.nextInt();
		}
		aryExchange(a,b);
	}

	static void aryExchange(int[] a, int[] b){
		int cnt = a.length;
		int num = 0;
		if(a.length < b.length){
			cnt = b.length;
		}
		for(int i = 0; i < cnt; i++){
			if(i == cnt){
				break;
			}
			num = a[i];
			a[i] = b[i];
			b[i] = num;
		}
	}
}
