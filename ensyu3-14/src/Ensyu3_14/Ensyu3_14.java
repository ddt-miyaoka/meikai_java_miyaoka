package Ensyu3_14;
//List3-13と同様に、二つの整数値を読み込んで、小さいほうの値と大きいほうの値の両方を表示するプログラムを作成せよ
//ただし、二つの整数値が等しい場合は、右に示すように『二つの値は同じです。』と表示すること
import java.util.Scanner;

public class Ensyu3_14 {

	public static void main(String[] args) {
		//キーボードから値を読み込むための宣言
		Scanner stdInt = new Scanner(System.in);
		//一つ目の値を入力を促す
		System.out.println("一つ目の値：");
		//一つ目の値を入力する
		int firstNumber = stdInt.nextInt();
		//二つ目の値を入力を促す
		System.out.println("二つ目の値：");
		//二つ目の値を入力する
		int secondNumber = stdInt.nextInt();
		//大きい値を代入するための変数
		int maxNumber;
		//小さい値を代入するための変数
		int minNumber;

		//一つ目の値と二つ目の値を比較
		if(firstNumber > secondNumber){
			//一つ目の値のほうが大きいため変数に値を代入
			maxNumber = firstNumber;
			//二つ目の値のほうが小さいため変数に値を代入
			minNumber = secondNumber;
			//大きい値を表示させる
			System.out.println("大きい値は：" + firstNumber);
			//小さい値を表示させる
			System.out.println("小さい値は："+ secondNumber);
		//一つ目の値と二つ目の値を比較
		}else if(firstNumber < secondNumber){
			//二つ目の値のほうが大きいため変数に値を代入
			maxNumber = secondNumber;
			//一つ目の値のほうが小さいため変数に値を代入
			minNumber = firstNumber;
			//大きい値を表示させる
			System.out.println("大きい値は：" + secondNumber);
			//小さい値を表示させる
			System.out.println("小さい値は："+ firstNumber);
		//二つの値が同じ場合
		}else if(firstNumber == secondNumber){
			//二つの値が同じだと表示する
			System.out.println("二つの値は同じです");
		}
	}

}