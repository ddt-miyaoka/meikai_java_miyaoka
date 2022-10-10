package Ensyu4_14;

import java.util.Scanner;

public class Ensyu4_14 {

	public static void main(String[] args) {
		//値をキーボードから入力するための宣言
		Scanner stdIn = new Scanner(System.in);

		//説明
		System.out.println("1からｎまでの和を求めます");
		//数字の入力を促す
		System.out.print("nの値：");
		//キーボードから入力した値を入れる
		int n = stdIn.nextInt();
		//合計の値を宣言
		int sum = 0;
		//入力した値までの数字を繰り返し出力する
		for (int i = 1; i<=n; i++){
			//合計の値を更新
			sum += i;
			//nまでの値を出力
			System.out.print(i);
			//nより小さい場合は数字と数字の間に＋を出力
			if(i < n){
			//+を出力する
			System.out.print("+");
			}
		}
		//合計の値を出力する
		System.out.print("=" + sum);
	}

}
