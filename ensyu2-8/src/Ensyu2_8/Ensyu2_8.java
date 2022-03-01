package Ensyu2_8;
//キーボードから読み込んだ整数値プラスマイナス5の範囲の整数値をランダムに生成して表示するプログラムを作成せよ。
import java.util.Random;
import java.util.Scanner;

public class Ensyu2_8 {

	public static void main(String[] args) {
		//キーボードから整数値を読み込むための宣言
		Scanner stdIn = new Scanner(System.in);
		//ランダムな値を生成するための宣言
		Random rand = new Random();
		//整数値の入力を促す
		System.out.print("整数値：");
		//キーボードから読み込んだ整数値を代入する
		int firstNumber = stdIn.nextInt();
		//-5以上＋5以下のランダムな値を生成し代入する
		int secondNumber = rand.nextInt(11)-5;
		//キーボードで入力した値とランダム生成した値を合体させる
		int mixNumber= firstNumber + secondNumber;
		//合体した±5の範囲の値を表示させる
		System.out.println("その値の±5の乱数を生成しました。それは" + mixNumber + "です。");
	}

}
