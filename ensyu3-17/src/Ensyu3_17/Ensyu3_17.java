package Ensyu3_17;
//0，1，2のいずれかの値の乱数を生成し、0であればグーを、1であればチョキを、2であればパーを表示するプログラムを作成せよ
import java.util.Random;

public class Ensyu3_17 {

	public static void main(String[] args) {
		//ランダムで数字を取得するための宣言
		Random randInt = new Random();
		//0～2までの範囲のランダムな値を代入
		int switchNumber = randInt.nextInt(3);

		//ランダムで取得した値を用いてSwitch文を実行
		switch(switchNumber){
		//0の場合はグーを表示
		case 0:
			System.out.println("グー");
		//Switch文を抜ける
		break;
		//1の場合はチョキを表示
		case 1:
			System.out.println("チョキ");
		//Switch文を抜ける
		break;
		//2の場合はパーを表示
		case 2:
			System.out.println("パー");
		//Switch文を抜ける
		break;
		}
	}

}
