package Ensyu3_5;

import java.util.Scanner;

//正の整数値を読み込んで、それが5で割り切れれば『その値は5で割り切れます。』と表示し、そうでなければ『その値は5で割り切れません。』と表示するプログラムを作成せよ。
//※正でない値を読み込んだ場合は、『正でない値が入力されました。』と表示すること。
public class Ensyu3_5 {

	public static void main(String[] args) {
		//キーボードから値を取得するための宣言
		Scanner stdInt = new Scanner(System.in);
		//キーボードから取得した値を代入する
		int firstNumber = stdInt.nextInt();
		//入力した値が負の値かどうかを確認
		if (firstNumber < 0){
			//負の値だと表示する
			System.out.println("正でない値が入力されました。");
		//代入した値が5で割り切れるかを確認
		}else if(firstNumber % 5 ==0){
			//割り切れたら割り切れますと表示
			System.out.println("その値は5で割り切れます。");
		//入力した値が5で割り切れず、負の値でもない場合
		}else{
			//5で割り切れないと表示
			System.out.println("その値は5で割り切れません。");
		}
	}

}
