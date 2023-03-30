package Ensyu07_18;

import java.util.Scanner;

public class Ensyu07_18 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		System.out.print("配列要素数:");
		int x = stdIn.nextInt();
		System.out.print("削除する要素番号:");
		int idx = stdIn.nextInt();
		int[] a = new int[x];

		for(int i = 0; i < x; i++){
			a[i] = stdIn.nextInt();
		}
		aryRmv(a, idx);
		for(int i = 0; i < x; i++){
			System.out.print(a[i]);
		}
		


	}
	static void aryRmv(int[] a, int idx){
		for(int i = idx; i < a.length; i++){
			if(i == a.length -1){
				break;
			}
			a[i] = a[i+1];
		}
	}
}
