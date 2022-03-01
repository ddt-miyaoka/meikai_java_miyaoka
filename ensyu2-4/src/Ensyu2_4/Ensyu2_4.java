package Ensyu2_4;
//右に示すように、キーボードから読み込んだ整数値に10を加えた値と10を減じた値を出力するプログラムを作成せよ。
import java.util.Scanner;

public class Ensyu2_4 {

	public static void main(String[] args) {
		//キーボードの入力を促す
		System.out.print("整数値：");
		//キーボードからの入力を読み取る
		Scanner stdInt = new Scanner(System.in);
		//キーボードから入力した値を代入する
		int firstNumber = stdInt.nextInt();
		//入力した値に10を加えた値を表示する
		System.out.println("10を加えた値は" + (firstNumber + 10) + "です。");
		//入力した値から10を減じた値を表示する
		System.out.println("10を減じた値は" + (firstNumber - 10) + "です。");
	}

}
