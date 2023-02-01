package Ensyu06_08;
//double型の配列の全要素の合計値と平均値を求めるプログラムを作成せよ。要素数と全要素の値はキーボードから読み込むこと
import java.util.Scanner;

public class Ensyu06_08 {

	public static void main(String[] args) {
		//キーボードから値を読み込むための宣言
		Scanner stdIn = new Scanner(System.in);
		//入力を促す
		System.out.print("要素数：");
		//配列の要素数を入力
		int n = stdIn.nextInt();
		//入力した要素数の配列を生成
		double[] a = new double[n];

		//合計値
		double sum = 0;
		//生成した配列aの全要素を走査
		for(double i : a){
			//要素の値の入力を促す
			System.out.print("要素の値は？：");
			//要素の値を入力
			sum += stdIn.nextDouble();
		}
		//入力した値の合計を表示
		System.out.println("合計は" + sum + "です。");
		//入力した値の平均を表示
		System.out.println("平均は" + sum / n + "です。");
	}

}
