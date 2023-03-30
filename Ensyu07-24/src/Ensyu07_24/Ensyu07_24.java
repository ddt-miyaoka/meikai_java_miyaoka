package Ensyu07_24;

import java.util.Scanner;

public class Ensyu07_24 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		int x = stdIn.nextInt();
		int[] a = new int[x];
		for(int i = 0; i < a.length; i++){
			a[i] = stdIn.nextInt();
		}
		int idx = stdIn.nextInt();
		arrayRmvOf(a,idx);
	}
	static int[] arrayRmvOf(int[] a, int idx){
		int[] b = new int[a.length - 1];
		for(int i = 0; i < b.length; i++){
			if(i == idx){
				b[i] = a[i +1];
				i++;
			}else{
				b[i] = a[i];
			}
		}
		return b;
	}
}
