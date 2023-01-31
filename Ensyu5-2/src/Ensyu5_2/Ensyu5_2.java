package Ensyu5_2;
//Float型の変数とDouble型の変数に値を読み込んで表示するプログラムを作成せよ。
import java.util.Scanner;

public class Ensyu5_2 {

	public static void main(String[] args) {
		//キーボードから値を読み込むための宣言
		Scanner stdIn = new Scanner(System.in);

		//Float型の値の入力を促す
		System.out.println("float:");
		//Float型の値を入力
		float x = stdIn.nextFloat();
		//Double型の値の入力を促す
		System.out.println("double:");
		//Double型の値を入力
		double y = stdIn.nextDouble();

		//入力した値を表示
		System.out.println("x=" + x);
		//入力した値を表示
		System.out.println("y=" + y);
	}

}
