package Ensyu07_16;

import java.util.Scanner;

public class Ensyu07_16 {

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
		int min = minOf(a);
		System.out.print(min);
	}
	static int minOf(int[] a){
		int min = a[0];
		for(int i = 0; i < a.length; i++){
			if(a[i] < min){
				min = a[i];
			}
		}
		return min;
	}
}
