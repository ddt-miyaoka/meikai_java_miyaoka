package Ensyu3_15;
//二つの値を読み込んで降順にソートするプログラムを作成せよ
import java.util.Scanner;

public class Ensyu3_15 {

	public static void main(String[] args) {
		//キーボードから値を読み込むための宣言
		Scanner stdInt = new Scanner(System.in);
		//一つ目の値を入力
		int firstNumber = stdInt.nextInt();
		//二つ目の値を入力
		int secondNumber = stdInt.nextInt();
		//もし一つ目の値のほうが小さければ順番を入れ替える
		if (firstNumber < secondNumber){
			//一つ目のあたいを別の変数に代入
			int changeNumber = firstNumber;
			//一つ目の値を二つ目の値で上書きする
			firstNumber = secondNumber;
			//代入して置いた値を二つ目の値に上書きする
			secondNumber = changeNumber;
		}
		//大きい順番に表示する
		System.out.println("大きい順番に値を表示する");
		//大きいほうの値を表示
		System.out.println(firstNumber);
		//小さいほうの値を表示
		System.out.println(secondNumber);

	}

}
