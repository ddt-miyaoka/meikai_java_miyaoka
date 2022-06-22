package Ensyu3_9;
//二つの実数値を読み込んで、大きいほうの値を表示するプログラムを作成せよ。
import java.util.Scanner;

public class Ensyu3_9 {

	public static void main(String[] args) {
		//キーボードから値を入力するための宣言
		Scanner stdInt = new Scanner(System.in);
		//一つ目の値の入力を促す
		System.out.println("aの値：");
		//キーボードから値を入力し一つ目の値に代入
		int firstNumber = stdInt.nextInt();
		//二つ目の値の入力を促す
		System.out.println("bの値：");
		//キーボードから値を入力し二つ目の値に代入
		int secondNumber = stdInt.nextInt();
		//入力した値のうち、大きいほうの値だけを表示させる
		System.out.println("大きいほうの値は"+ (firstNumber > secondNumber ? firstNumber:secondNumber)+"です。");
	}

}
