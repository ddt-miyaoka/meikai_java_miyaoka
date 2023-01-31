package Ensyu5_5;
//三つの整数値を読み込んで、その合計と平均を表示するプログラムを作成せよ。平均はキャスト演算子を利用して求め、実数として表示すること
import java.util.Scanner;

public class Ensyu5_5 {

	public static void main(String[] args) {
		//キーボードから値を読み込むための宣言
		Scanner stdIn = new Scanner(System.in);
		//説明
		System.out.println("3つの整数値の平均値を求めます。");
		//一つ目の値の入力を促す
		System.out.print("一つ目の値：");
		//一つ目の値を入力
		int firstNumber = stdIn.nextInt();
		//二つ目の値の入力を促す
		System.out.print("二つ目の値：");
		//二つ目の値を入力
		int secondNumber = stdIn.nextInt();
		//三つ目の値の入力を促す
		System.out.print("三つ目の値：");
		//三つ目の値を入力
		int thirdNumber = stdIn.nextInt();

		//入力した値の合計をdouble型に置き換えてから平均値を求める
		double aveNumber = (double)(firstNumber + secondNumber + thirdNumber) / 3;
		//三つの値の合計を表示する
		System.out.println("三つの値の合計は" + (firstNumber + secondNumber + thirdNumber) + "です。");
		//求めた平均値を表示させる
		System.out.println("三つの整数値の平均は" + aveNumber + "です。");
	}

}
