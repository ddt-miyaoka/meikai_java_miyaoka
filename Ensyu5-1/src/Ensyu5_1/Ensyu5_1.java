package Ensyu5_1;
//10進数を読み込んで、その値を8進数と16進数で表示するプログラムを作成せよ。
import java.util.Scanner;

public class Ensyu5_1 {

	public static void main(String[] args) {
		//キーボードから値を読み込むための宣言
		Scanner stdIn = new Scanner(System.in);

		//ベースとなる値を入力
		int setNumber = stdIn.nextInt();

		//入力した値を8進数に変換して表示
		System.out.printf("setNumber = %o\n", setNumber);
		//入力した値を16進数に変換して表示
		System.out.printf("setNumber = %x", setNumber);
	}

}
