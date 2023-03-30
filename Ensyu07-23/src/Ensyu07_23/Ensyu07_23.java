package Ensyu07_23;

import java.util.Scanner;

public class Ensyu07_23 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		int x = stdIn.nextInt();
		int[] a = new int[x];
		for(int i = 0; i < a.length; i++){
			a[i] = stdIn.nextInt();
		}
		int src = stdIn.nextInt();
		arraySrchIdx(a,src);
	}
	static int[] arraySrchIdx(int[] a, int x){
		int num = 0;
		int[] b = new int[a.length];
		for(int i = 0; i < a.length; i++){
			if(a[i] == x){
				b[num] = i;
				num++;
			}
		}
		return b;
	}
}
