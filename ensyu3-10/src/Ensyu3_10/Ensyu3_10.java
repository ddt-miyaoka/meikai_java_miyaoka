package Ensyu3_10;
//二つの整数値を読み込んで、それらの値の差を表示するプログラムを作成せよ。
import java.util.Scanner;

public class Ensyu3_10 {

	public static void main(String[] args) {
		//キーボードから値を入力するための宣言
		Scanner stdInt = new Scanner(System.in);
		//一つ目の値の入力を促す
		System.out.println("一つ目の値：");
		//一つ目の値を入力する
		int firstNumber = stdInt.nextInt();
		//二つ目の値の入力を促す
		System.out.println("二つ目の値：");
		//二つ目の値を入力する
		int secondNumber = stdInt.nextInt();
		//一つ目の値が二つ目の値より大きいかを確認
		if (firstNumber > secondNumber){
			//一つ目の値のほうが大きい場合、一つ目-二つ目で差を求める
			System.out.println("二つの値の差は" + (firstNumber - secondNumber) + "です。");
		//一つ目の値が二つ目の値より小さいかを確認
		}else if (firstNumber < secondNumber){
			//二つ目の値のほうが大きい場合、二つ目-一つ目で差を求める
			System.out.println("二つの値の差は" +(secondNumber - firstNumber) + "です。");
		//一つ目と二つ目の値が同じの場合
		}else if (firstNumber == secondNumber){
			//二つの数字に差はないことを表示する
			System.out.println("二つの値に差はありません");
		}
	}

}
