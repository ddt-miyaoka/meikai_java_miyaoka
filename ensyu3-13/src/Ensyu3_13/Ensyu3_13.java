package Ensyu3_13;
//キーボードから読み込んだ三つの整数値の中央値を求めて表示するプログラムを作成せよ
import java.util.Scanner;

public class Ensyu3_13 {

	public static void main(String[] args) {
		//キーボードから値を取得するための宣言
		Scanner stdInt = new Scanner(System.in);
		//一つ目の値の入力を促す
		System.out.println("一つ目の値：");
		//キーボードから入力した値を一つ目の値に代入する
		int firstNumber = stdInt.nextInt();
		//二つ目の値の入力を促す
		System.out.println("二つ目の値：");
		//キーボードから入力した値を二つ目の値に代入する
		int secondNumber = stdInt.nextInt();
		//三つ目の値の入力を促す
		System.out.println("三つ目の値：");
		//キーボードから入力した値を三つ目の値に代入する
		int thirdNumber = stdInt.nextInt();
		//最大値の値の初期値として一つ目の値を代入
		int maxNumber = firstNumber;
		//最小値の値の初期値として二つ目の値を代入
		int minNumber = secondNumber;
		//中央値の値の初期値として三つ目の値を代入
		int mediumNumber = thirdNumber;

		//三つの値のうちどれが最大値かを確認するため一つずつ確認する
		if(maxNumber < secondNumber){
			//条件に合えば最大値を更新する
			maxNumber= secondNumber;
		}
		//残りの値と比較する
		if(maxNumber < thirdNumber){
			//条件に合えば最大値を更新する
			maxNumber= thirdNumber;
		}
		//三つの値のうちどれが最小値かを確認するため一つずつ確認する
		if(minNumber > firstNumber){
			//条件に合えば最小値を更新する
			minNumber = firstNumber;
		}
		//残りの値と比較する
		if(minNumber > thirdNumber){
			//条件に合えば最小値を更新する
			minNumber = thirdNumber;
		}

		//最小値と最大値を確認し、それ以外の値を中央値として代入する
		if(minNumber == firstNumber && maxNumber == secondNumber){
			//条件に合えば中央値を更新する
			mediumNumber = thirdNumber;
		//最小値と最大値を確認し、それ以外の値を中央値として代入する
		}else if(minNumber == firstNumber && maxNumber == thirdNumber){
			//条件に合えば中央値を更新する
			mediumNumber = secondNumber;
		//最小値と最大値を確認し、それ以外の値を中央値として代入する
		}else if(minNumber == secondNumber && maxNumber == firstNumber){
			//条件に合えば中央値を更新する
			mediumNumber = thirdNumber;
		//最小値と最大値を確認し、それ以外の値を中央値として代入する
		}else if(minNumber == secondNumber && maxNumber == thirdNumber){
			//条件に合えば中央値を更新する
			mediumNumber = firstNumber;
		//最小値と最大値を確認し、それ以外の値を中央値として代入する
		}else if(minNumber == thirdNumber && maxNumber == firstNumber){
			//条件に合えば中央値を更新する
			mediumNumber = secondNumber;
		//最小値と最大値を確認し、それ以外の値を中央値として代入する
		}else if(minNumber == thirdNumber && maxNumber == secondNumber){
			//条件に合えば中央値を更新する
			mediumNumber = firstNumber;
		}
		//最後に中央値を表示する
		System.out.println("中央値は：" + mediumNumber);
	}

}
