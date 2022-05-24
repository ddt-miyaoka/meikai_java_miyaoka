package Ensyu4_07;
//読み込んだ値の個数だけ記号文字を表示するプログラムを作成せよ。表示は*と＋を交互に行うこと
import java.util.Scanner;

public class Ensyu4_07 {

	public static void main(String[] args) {
		//キーボードから値を読み込むための宣言
		Scanner stdInt = new Scanner(System.in);

		//入力を促す
		System.out.print("何個表示しますか：");
		//表示する数を入力
		int firstNumber = stdInt.nextInt();
		//繰り返しの判定のための値を設定
		int secondNumber = 0;
		//入力した値が大きい限り繰り返す
		while(firstNumber > secondNumber){
			//*を表示する
			System.out.print("*");
			//ループのために値を加算
			secondNumber ++;
			//加算されてループの条件を満たせているかを確認する
			if(firstNumber > secondNumber){
			//条件を満たしているのであれば＋を表示
			System.out.print("+");
			//ループのために値を加算
			secondNumber ++;
			}
		}

	}

}
