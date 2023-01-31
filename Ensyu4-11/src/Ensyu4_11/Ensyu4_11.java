package Ensyu4_11;
//正の整数値を0までカウントダウンするList4-4をfor文で実現せよ
import java.util.Scanner;

public class Ensyu4_11 {

	public static void main(String[] args) {
		//キーボードから値を読み込むための宣言
		Scanner stdInt = new Scanner(System.in);
		//入力を促す
		System.out.println("カウントダウンします");
		//カウントダウン用の値をキーボードから入力する
		int countNumber = stdInt.nextInt();
		//カウントダウンが0になるまで数字を減らしながら繰り返し表示させる
		for(int i = 0; i <= countNumber; i++)
			//カウントダウンの数字を表示させる
			System.out.println(countNumber - i);
	}

}
