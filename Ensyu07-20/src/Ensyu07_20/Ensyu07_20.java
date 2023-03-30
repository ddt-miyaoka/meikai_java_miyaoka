package Ensyu07_20;

import java.util.Scanner;

public class Ensyu07_20 {

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
		aryIns(a,idx,n);

	}
	static void aryIns(int[] a, int idx, int n){
		for(int i = a.length-1; i >= 0; i--){
			if(i == a.length-1){
				continue;
			}else if(i == idx){
				a[i + 1] = a[i];
				a[i] = n;
				break;
			}
			a[i + 1] = a[i];
		}
	}
}
