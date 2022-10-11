package Ensyu3_11;
//右に示すように、二つの整数値を読み込んで、それらの値の差が10以下であれば、『それらの差は10以下です。』と表示し、
//そうでなければ『それらの差は11以上です。』と表示するプログラムを作成せよ。
import java.util.Scanner;

public class Ensyu3_11 {

	public static void main(String[] args) {
		//キーボードから値を入力するための宣言
		Scanner stdInt = new Scanner(System.in);

		//一つ目の値の入力を促す
		System.out.println("整数A：");
		//一つ目の値をキーボードから入力する
		int firstNumber = stdInt.nextInt();
		//二つ目の値の入力を促す
		System.out.println("整数B：");
		//二つ目の値をキーボードから入力する
		int secondNumber = stdInt.nextInt();
		//二つの整数の差分を代入する変数を初期化
		int differenceNumber = 0;

		//もし一つ目の値のほうが二つ目の値よりも大きければ
		if (firstNumber > secondNumber){
			//一つ目の値マイナス二つ目の値が二つの差となる
			differenceNumber  = firstNumber - secondNumber;
		//もし二つ目の値のほうが一つ目の値よりも大きければ
		}else if(firstNumber < secondNumber){
			//二つ目の値マイナス一つ目の値が二つの差となる
			differenceNumber = secondNumber - firstNumber;
		}

		//二つの数字の値の差が10以下かどうかを確認
		if (differenceNumber <= 10){
			//10以下だと表示する
			System.out.println("それらの差は10以下です。");
		//二つの数字の値の差が11以上かどうかを確認
		}else if(differenceNumber > 10){
			//差は11以上だと表示する
			System.out.println("それらの差は11以上です。");
		}
	}
}
