package Ensyu07_25;

import java.util.Scanner;

public class Ensyu07_25 {

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
		arrayRmvOfN(a, idx, n);
	}
	static int[] arrayRmvOfN(int[] a, int idx, int n){
		int[] b = new int[a.length - n];
		int num = 0;
		for(int i = 0; i < a.length; i++){
			if(i == idx){
				for(int j = 0; j < n; j++){
					i++;
				}
			}
			b[num] = a[i];
			num++;
		}
		return b;
	}
}
