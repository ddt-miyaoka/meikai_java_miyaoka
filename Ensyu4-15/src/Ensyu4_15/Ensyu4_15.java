package Ensyu4_15;
//身長と標準体重の対応表を表示するプログラムを作成せよ。表示する身長の範囲(開始値、終了値、増分)は、整数値として読み込むこと。
//標準体重は(身長—100)*0.9によって求められる
import java.util.Scanner;

public class Ensyu4_15 {

	public static void main(String[] args) {
		//キーボードから値を読み込むための宣言
		Scanner stdIn = new Scanner(System.in);
		//開始値の入力を促す
		System.out.print("何cmから:");
		//キーボードから値を読み込む
		int firstNumber = stdIn.nextInt();
		//終了値の入力を促す
		System.out.print("何cmまで:");
		//キーボードから値を読み込む
		int secondNumber = stdIn.nextInt();
		//増幅値の入力を促す
		System.out.println("何cmずつ:");
		//キーボードから値を読み込む
		int thirdNumber = stdIn.nextInt();
		//結果をわかりやすくするための文言を表示
		System.out.println("身長" + "   " + "標準体重");
		//開始値が終了値に達するまで繰り返す
		while(firstNumber <= secondNumber){
			//身長と標準体重を表示させる
			System.out.println(firstNumber + "     " + (firstNumber-100)*0.9);
			//開始値に増幅値を加算する
			firstNumber += thirdNumber;
		}
	}

}
