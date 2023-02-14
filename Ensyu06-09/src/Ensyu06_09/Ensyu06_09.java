package Ensyu06_09;
//要素型がint型である配列を作り、全要素を1～10の乱数で埋め尽くす(1以上10以下の値を代入する)プログラムを作成せよ。要素数はキーボードから読み込むこと。

import java.util.Random;
import java.util.Scanner;

public class Ensyu06_09 {

	public static void main(String[] args) {
		//キーボードから値を読み込むための宣言
		Scanner stdIn = new Scanner(System.in);
		//乱数を生成するための宣言
		Random rand = new Random();
		//要素数の入力を促す
		System.out.print("要素数：");
		//要素数を入力
		int n = stdIn.nextInt();
		//入力した要素数の配列を生成
		int[] a = new int[n];

		//要素に1～10までの乱数を入れていく
		for(int i = 0; i < n; i++){
			//要素に1～10までの乱数を入れる
			a[i] = rand.nextInt(10) + 1;
			//要素に入れられた値を表示させる
			System.out.println("a[" + i +"]=" + a[i]);
		}
	}
}
