package Ensyu3_16;
//三つの整数値を読み込んで昇順に表示するプログラムを作成せよ
import java.util.Scanner;

public class Ensyu3_16 {

	public static void main(String[] args) {
		//キーボードから値を読み込むための宣言
		Scanner stdInt = new Scanner(System.in);
		//一つ目の値を入力する
		int firstNumber = stdInt.nextInt();
		//二つ目の値を入力する
		int secondNumber = stdInt.nextInt();
		//三つ目の値を入力する
		int thirdNumber = stdInt.nextInt();

		//三つの値のうち一番大きい値を代入する変数を宣言
		int maxNumber = firstNumber;
		//三つの値のうち一番大きい値を判定する
		if (maxNumber < secondNumber){
			//一番大きい値を更新する
			maxNumber = secondNumber;
		//数値を確認し大きいかを判定
		}else if(maxNumber < thirdNumber){
			//条件に合えば一番大きい値を更新する
			maxNumber = thirdNumber;
		}

		//三つの値のうち一番小さい値を代入する変数を宣言
		int minNumber = secondNumber;
		//三つの値のうち一番小さい値を判定する
		if(minNumber > firstNumber){
			//一番小さい値を更新
			minNumber = firstNumber;
		//数値を確認し小さいかを判定
		}else if(minNumber > thirdNumber){
			//条件に合えば一番小さい値を更新する
			minNumber = thirdNumber;
		}

		//三つの値のうち真ん中の数値を代入する変数の初期化
		int mediumNumber = 0;
		//一番大きい値と一番小さい値を使い、それ以外の数字を確認する
		if(minNumber == firstNumber && maxNumber == secondNumber){
			//真ん中の値を更新する
			mediumNumber = thirdNumber;
		//一番大きい値と一番小さい値を使い、それ以外の数字を確認する
		}else if(minNumber == firstNumber && maxNumber == thirdNumber){
			//真ん中の値を更新する
			mediumNumber = secondNumber;
		//一番大きい値と一番小さい値を使い、それ以外の数字を確認する
		}else if(minNumber == secondNumber && maxNumber == firstNumber){
			//真ん中の値を更新する
			mediumNumber = secondNumber;
		//一番大きい値と一番小さい値を使い、それ以外の数字を確認する
		}else if(minNumber == secondNumber && maxNumber == thirdNumber){
			//真ん中の値を更新する
			mediumNumber = firstNumber;
		//一番大きい値と一番小さい値を使い、それ以外の数字を確認する
		}else if(minNumber == thirdNumber && maxNumber == firstNumber){
			//真ん中の値を更新する
			mediumNumber = secondNumber;
		//一番大きい値と一番小さい値を使い、それ以外の数字を確認する
		}else if(minNumber == thirdNumber && maxNumber == secondNumber){
			//真ん中の値を更新する
			mediumNumber = firstNumber;
		}

		//ここまでで一番小さい値、真ん中の値、一番大きい値がそれぞれ判定で来たので順番に表示させる
		System.out.println("小さい順に値を表示する");
		//一番小さい値を表示
		System.out.println(minNumber);
		//真ん中の値を表示
		System.out.println(mediumNumber);
		//一番大きい値を表示
		System.out.println(maxNumber);
	}

}
