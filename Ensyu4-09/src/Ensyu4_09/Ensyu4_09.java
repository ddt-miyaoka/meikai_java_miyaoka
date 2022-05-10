package Ensyu4_09;
//右に示すように、正の整数値ｎを読み込んで、1からｎまでの積を求めるプログラムを作成せよ
import java.util.Scanner;

public class Ensyu4_09 {

	public static void main(String[] args) {
		//数字を入力するための宣言
		Scanner stdInt = new Scanner(System.in);
		//nの値の入力を促す
		System.out.println("nの値：");
		//nの値を入力
		int setNumber = stdInt.nextInt();
		//積を求めるための繰り返し用の値
		int countNumber = 1;
		//最終的な積を設定するための値を用意
		int totalNumber = setNumber;
		//ｎの値の積を求めるための繰り返し
		while(countNumber < setNumber){
			//積を求めるため順番に数字を乗算していく
			totalNumber *= countNumber;
			//繰り返し用のため値を加算
			countNumber++;
		}
		//最終的な値を出力
		System.out.println("1から" + setNumber + "までの積は" + totalNumber + "です" );
	}

}
