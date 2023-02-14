package Ensyu06_11;

import java.util.Random;
import java.util.Scanner;

public class Ensyu06_11 {

	public static void main(String[] args) {
		//キーボードから値を読み込むための宣言
		Scanner stdIn = new Scanner(System.in);
		//乱数を生成するための宣言
		Random rand = new Random();
		//要素数の入力を促す
		System.out.print("要素数：");
		//要素数を１～10の乱数で決定する
		int n = rand.nextInt(10) + 1;
		//決定した要素数の配列を生成
		int[] a = new int[n];
		
		boolean checkNum = false;
		//要素に1～10までの乱数を入れていく
		for(int i = 0; i < n; i++){
			//要素に1～10までの乱数を入れる
			a[i] = rand.nextInt(10) + 1;
			CHECK: do{
				for(int j = 0; j < i; j ++){
					if(a[j] == a[i]){
						a[i] = rand.nextInt(10) + 1;
						checkNum = true;
						continue CHECK;
					}else{
						checkNum = false;
					}
				}
			}while(checkNum);
			//要素に入れられた値を表示させる
			System.out.println("a[" + i +"]=" + a[i]);
		}
	}

}
