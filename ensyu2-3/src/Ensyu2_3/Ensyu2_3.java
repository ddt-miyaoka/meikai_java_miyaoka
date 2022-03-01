package Ensyu2_3;
//右に示すように、キーボードから読み込んだ整数値をそのまま反復して表示するプログラムを作成せよ。
import java.util.Scanner;

public class Ensyu2_3 {

	public static void main(String[] args) {
		//キーボードからの読み込みを行う
		Scanner stdIn = new Scanner(System.in);
		//数字の入力を促す
		System.out.print("整数値：");
		//キーボードで入力した値を代入する
		int firstNumber = stdIn.nextInt();
		//入力した値を表示させる
		System.out.println(firstNumber + "と入力しましたね。");
	}

}
