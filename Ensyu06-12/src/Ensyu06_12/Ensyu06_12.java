package Ensyu06_12;

import java.util.Random;
import java.util.Scanner;

public class Ensyu06_12 {

	public static void main(String[] args) {
		//キーボードから値を読み込むための宣言
		Scanner stdIn = new Scanner(System.in);
		//乱数を生成するための宣言
		Random rand = new Random();

		//要素数を１～10の乱数で決定する
		int n = rand.nextInt(10) + 1;
		System.out.println("要素数："+ n);
		//決定した要素数の配列を生成
		int[] a = new int[n];
		int[] b = new int[n];

		boolean checkNum = true;
		//要素に1～10までの乱数を入れていく
		System.out.println("シャッフル前の文字を表示");
		for(int i = 0; i < n; i++){
			//要素に1～10までの乱数を入れる
			a[i] = rand.nextInt(10) + 1;
			System.out.println("a[" + i +"]=" + a[i]);
		}
		System.out.println("シャッフル後の文字を表示");
			for(int i = a.length -1; i >= 0; i--){
				int j = rand.nextInt(n);
				if(b[j] == 0){
					int c = a[i];
					b[j] = c;
				}else{
					//既に値が入っている要素を乱数が指定した場合、再度抽選させるためiを戻す
					i++;
			}
		}
			//要素に入れられた値を表示させる
			for(int i = 0; i < n; i ++){
				System.out.println(b[i]);
			}
	}
}
