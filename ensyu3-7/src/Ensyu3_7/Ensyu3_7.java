package Ensyu3_7;
//正の整数値を読み込んで、それを3で割った値に応じた『その値は3で割り切れます。』『その値を3で割った余りは1です』
//『その値を3で割り切った余りは2です。』のいずれかを表示するプログラムを作成せよ。
//※正でない値を読み込んだ場合は、『正でない値が入力されました。』と表示すること。
import java.util.Scanner;

public class Ensyu3_7 {

	public static void main(String[] args) {
		//キーボードから入力した値を取得するための宣言
		Scanner stdInt = new Scanner(System.in);
		//キーボードで入力した値を代入する
		int firstNumber = stdInt.nextInt();
		//入力した値が負の値かどうかを確認する
		if(firstNumber < 0){
			//負の値だと表示する
			System.out.println("正でない値が入力されました。");
		//入力した値が3で割り切れるかを確認する
		}else if(firstNumber % 3 ==0){
			//3で割り切れると表示する
			System.out.println("その値は3で割り切れます。");
		//入力した値を3で割った余りは1かどうかの判定
		}else if(firstNumber % 3 ==1){
			//3で割った余りは1だと表示する
			System.out.println("その値を3で割った余りは1です。");
		//入力した値を3で割った余りは2かどうかの判定
		}else if(firstNumber % 3 ==2){
			//3で割った余りは2だと表示する
			System.out.println("その値を3で割り切った余りは2です。");
		}
	}
}
