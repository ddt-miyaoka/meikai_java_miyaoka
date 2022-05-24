package Ensyu4_05;
//List4-5のx--が--xとなっていたら、どのような出力が得られるかを検討せよ。プログラムを作成して実行結果を確認すること
import java.util.Scanner;

public class Ensyu4_05 {

	public static void main(String[] args) {
		//キーボードから値を読み込むための宣言
		Scanner stdIn = new Scanner(System.in);

		//カウントダウンの開始を表示
		System.out.println("カウントダウンします。");
		//カウントダウン用の変数(x）
		int countNumber;
		do{
			//正の整数値の入力を促す
			System.out.println("正の整数値：");
			//カウントダウン用の数字を入力
			countNumber = stdIn.nextInt();
		//0以下になるまで繰り返す
		}while (countNumber <= 0);

		//0以上の場合以下の数字を表示する
		while (countNumber >= 0)
		//入力した値をマイナス1した値から表示する
		System.out.println(--countNumber);
		}
}
