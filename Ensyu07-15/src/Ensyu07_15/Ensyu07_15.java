package Ensyu07_15;

import java.util.Scanner;

public class Ensyu07_15 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		System.out.print("配列要素数:");
		int x = stdIn.nextInt();

		int[] a = new int[x];
		for(int i = 0; i < x; i++){
			System.out.print(i +1 + "つめの要素の値:");
			a[i] = stdIn.nextInt();
		}
		int sum = sumOf(a);
		System.out.print(sum);
	}
	static int sumOf(int[] a){
		int sum = 0;
		for(int i = 0; i < a.length; i++){
			sum += a[i];
		}
		return sum;
	}
}
