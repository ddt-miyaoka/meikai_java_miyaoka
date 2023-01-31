package Ensyu4_12;
//全問とは逆に、0から正の整数値までカウントアップするプログラムを作成せよ
import java.util.Scanner;

public class Ensyu4_12 {

	public static void main(String[] args) {
		//キーボードから値を入力するための宣言
		Scanner stdIn = new Scanner(System.in);
		//カウントアップ用の値をキーボードから入力する
		int countNumber = stdIn.nextInt();
		//0 から入力した値まで繰り返す
		for(int i = 0; countNumber >= i; i++)
			//カウントアップを表示させる
			System.out.println(i);
	}

}
