package Ensyu3_12;
//キーボードから読み込んだ三つの整数値の最小値を求めて表示するプログラムを作成せよ。
import java.util.Scanner;

public class Ensyu3_12 {

	public static void main(String[] args) {
		//キーボードから値を入力するための宣言
		Scanner stdInt = new Scanner(System.in);
		//一つ目の値の入力を促す
		System.out.println("一つ目の値：");
		//キーボードで入力した値を一つ目の値に代入する
		int firstNumber = stdInt.nextInt();
		//二つ目の値の入力を促す
		System.out.println("二つ目の値：");
		//キーボードで入力した値を二つ目の値に代入する
		int secondNumber = stdInt.nextInt();
		//三つ目の値の入力を促す
		System.out.println("三つ目の値：");
		//キーボードで入力した値を三つ目の値に代入する
		int thirdNumber = stdInt.nextInt();
		//最小値の基準として、まず一つ目の値を最小値として扱う
		int minNumber = firstNumber;
		//一つ目と二つ目の値を比べる
		if(minNumber > secondNumber){
			//二つ目のほうが小さければ最小値を更新
			minNumber = secondNumber;
		}
		//さらに三つ目の値とも比べていく
		if(minNumber > thirdNumber){
			//三つ目の値のほうが小さければ最小値を更新
			minNumber = thirdNumber;
		}
		//三つの値のうち一番小さい値を表示する
		System.out.println("三つの数字の最小値は" + minNumber);
	}

}
