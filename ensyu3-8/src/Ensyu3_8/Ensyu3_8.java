package Ensyu3_8;
//キーボードから読み込んだ点数に応じて、優/良/可/不可を判定して表示するプログラムを作成せよ。判定は以下のように行うこと。
//0～59→不可/60～69→可/70～79→良/80～100→優
import java.util.Scanner;

public class Ensyu3_8 {

	public static void main(String[] args) {
		//キーボードから値を読み込むための宣言
		Scanner stdInt = new Scanner(System.in);
		//キーボードから値を読み込んで代入する
		int checkNumber = stdInt.nextInt();
		//入力した値が60未満かどうかを確認
		if(checkNumber < 60){
			//60未満ならば不可を表示する
			System.out.println("不可");
		//入力した値が60以上70未満かどうかを確認
		}else if (checkNumber >= 60 && checkNumber < 70){
			//条件に合致した場合可と表示する
			System.out.println("可");
		//入力した値が70以上80未満かどうかを確認
		}else if (checkNumber >= 70 && checkNumber < 80){
			//条件に合致した場合良と表示する
			System.out.println("良");
		//入力した値が80以上かどうかを確認
		}else if (checkNumber >= 80){
			//条件に合致した場合優と表示する
			System.out.println("優");
		//入力した値が100を超えた場合
		}else if (checkNumber > 100){
			//成績の判定の場合100が上限であり、それ以上の値を入力した場合は範囲外として扱う
			System.out.println("範囲外の値です");
		}
	}
}
