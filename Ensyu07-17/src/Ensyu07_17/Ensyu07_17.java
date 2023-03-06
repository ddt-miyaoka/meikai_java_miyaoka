package Ensyu07_17;

import java.util.Scanner;

public class Ensyu07_17 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		System.out.print("配列要素数:");
		int x = stdIn.nextInt();
		System.out.print("検索キー:");
		int key = stdIn.nextInt();
		int[] a = new int[x];
		for(int i = 0; i < a.length; i++){
			a[i] = stdIn.nextInt();
		}
		int idx = linearSerarchR(a, key);
		if(idx == -1){
			System.out.print("対象のキーは存在しません");
		}else{
			System.out.print(idx +"番目に見つかりました");
		}
	}

	static int linearSerarchR(int[] a, int key){
		for(int i = a.length -1; i >= 0; i--){
			if(a[i] == key){
				return i;
			}
		}
		return -1;

	}
}
