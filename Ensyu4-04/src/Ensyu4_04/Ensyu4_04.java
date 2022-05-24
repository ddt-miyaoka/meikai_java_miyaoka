package Ensyu4_04;
//List4-4のwhile文終了時にxの値が-1になることを確認するプログラムを作成せよ
import java.util.Scanner;

public class Ensyu4_04 {

	public static void main(String[] args) {
		//キーボードから値を読み込むための宣言
		Scanner stdInt = new Scanner(System.in);
		//カウントダウン開始を告げる
		System.out.println("カウントダウンします");
		//カウントダウン用の変数を宣言
		int countNumber;
		do{
			//カウントダウン用の値の入力を促す
			System.out.println("正の整数値：");
			//カウントダウン用の値を入力
			countNumber = stdInt.nextInt();
		//0以下の場合もう一度入力させる
		}while (countNumber <= 0);
		//0以上である限り繰り返す
		while (countNumber >= 0){
			//数字を表示させる
			System.out.println(countNumber);
			//カウントダウン用にデクリメントする
			countNumber--;
		}
		//0未満になったら最後にカウントダウン用の数字を確認する
		System.out.println("最後の数字は"+countNumber);
	}

}
