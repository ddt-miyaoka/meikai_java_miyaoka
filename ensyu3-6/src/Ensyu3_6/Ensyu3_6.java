package Ensyu3_6;
//正の整数値を読み込んで、それが10の倍数であれば『その値は10の倍数です。』と表示し、
//そうでなければ『その値は10の倍数ではありません。』と表示するプログラムを作成せよ。
//※正でない値を読み込んだ場合は、『正でない値が入力されました。』と表示すること
import java.util.Scanner;

public class Ensyu3_6 {

	public static void main(String[] args) {
		//キーボードから入力した値を取得するための宣言
		Scanner stdInt = new Scanner(System.in);
		//キーボードで入力した値を代入する
		int firstNumber = stdInt.nextInt();
		//入力した値が負の値かどうかを確認する
		if (firstNumber < 0){
			//負の値だと表示する
			System.out.println("正でない値が入力されました。");
		//入力した値が10の倍数かどうかを確認
		}else if(firstNumber % 10 == 0){
			//10の倍数だと表示する
			System.out.println("その値は10の倍数です。");
		//入力した値が負の値でもなく、10の倍数でもない
		}else{
			//10の倍数ではないことを表示する
			System.out.println("その値は10の倍数ではありません。");
		}
	}

}
