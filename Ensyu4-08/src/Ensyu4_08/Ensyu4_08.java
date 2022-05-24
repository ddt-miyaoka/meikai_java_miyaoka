package Ensyu4_08;
//右に示すように、正の整数値を読み込んでその桁数を出力するプログラムを作成せよ
import java.util.Scanner;

public class Ensyu4_08 {

	public static void main(String[] args) {
		//キーボードから値を読み込むための宣言
		Scanner stdInt = new Scanner(System.in);
		//入力を促す
		System.out.println("整数値：");
		//桁数をカウントする対象を入力
		int firstNumber = stdInt.nextInt();
		//桁数をカウントするための変数
		int countNumber = 0;

		//数えてる値が0未満になるまで繰り返す
		while(firstNumber > 0){
			//入力した値を10で割る
			firstNumber /= 10;
			//割った回数で桁数を判別するため、カウントを増やす
			countNumber ++;
		}
		//最終的な桁数を表示する
		System.out.println("その値は"+countNumber+"桁です。");
	}

}
