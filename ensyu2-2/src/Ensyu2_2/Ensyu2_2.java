package Ensyu2_2;
//三つのint型変数に値を代入し、合計と平均を求めるプログラムを作成せよ。
public class Ensyu2_2 {

	public static void main(String[] args) {
		//3つのint型変数を宣言
		int firstNumber,secondNumber,thirdNumber;
		//宣言した変数に値を代入
		firstNumber = 10;
		//宣言した変数に値を代入
		secondNumber = 25;
		//宣言した変数に値を代入
		thirdNumber = 30;
		//合計を表示
		System.out.println("合計は" + (firstNumber + secondNumber + thirdNumber) +"です。");
		//平均を表示
		System.out.println("平均は" + (firstNumber + secondNumber + thirdNumber) /3 +"です。");
	}

}
