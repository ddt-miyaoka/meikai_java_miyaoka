package Ensyu06_10;

import java.util.Random;
import java.util.Scanner;

public class Ensyu06_10 {

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

		//数字チェック用の変数を宣言
		int checkNum = 0;
		//要素に1～10までの乱数を入れていく
		for(int i = 0; i < n; i++){
			//一つ前の要素と同じ数字になっていないかをチェックする
			do{
				//要素に1～10までの乱数を入れる
				a[i] = rand.nextInt(10) + 1;
			//一つ前の要素の値と同じ場合、再度乱数を取得させる
			}while(a[i] == checkNum);
			//今回取得した乱数を格納し、次の要素取得時に判定に使用する
			checkNum = a[i];
			//要素に入れられた値を表示させる
			System.out.println("a[" + i +"]=" + a[i]);
		}
	}
}
