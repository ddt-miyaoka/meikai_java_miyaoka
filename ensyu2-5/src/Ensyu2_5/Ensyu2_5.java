package Ensyu2_5;
//二つの実数値を読み込み、その和と平均を求めて表示するプログラムを作成せよ。
import java.util.Scanner;

public class Ensyu2_5 {

	public static void main(String[] args) {
		//キーボードからの入力を読み込めるようにする
		Scanner stdIn = new Scanner(System.in);

		//xの値の入力を促す
		System.out.print("xの値：");
		//キーボードから入力した値をxに代入する
		double x = stdIn.nextDouble();
		//yの値の入力を促す
		System.out.print("yの値：");
		//キーボードから入力した値をyに代入する
		double y = stdIn.nextDouble();
		//xとyを足した合計値を表示する
		System.out.println("合計は" + (x + y) + "です。");
		//xとyの平均を表示する
		System.out.println("平均は" + (x + y)/2 +"です。");

	}

}
