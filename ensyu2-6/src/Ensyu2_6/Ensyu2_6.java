package Ensyu2_6;
//三角形の底辺と高さを読み込んで、その面積を表示するプログラムを作成せよ。
import java.util.Scanner;

public class Ensyu2_6 {

	public static void main(String[] args) {
		//キーボードから入力した値を読み込めるようにする
		Scanner stdIn = new Scanner(System.in);
		//三角形の面積を求めることを促す
		System.out.println("三角形の面積を求めます。");
		//底辺の値の入力を促す
		System.out.print("底辺：");
		//キーボードから入力した値を代入する
		double firstNumber = stdIn.nextDouble();
		//高さの値の入力を促す
		System.out.print("高さ：");
		//キーボードから入力した値を代入する
		double secondNumber = stdIn.nextDouble();
		//入力した値を用いて、面積を表示する
		System.out.println("面積は" + (firstNumber * secondNumber)/2 + "です。");
	}

}
