package Ensyu4_20;
//ｎ段の正方形を表示するプログラムを作成せよ。右に示すのは、ｎが３の時の実行結果である
import java.util.Scanner;

public class Ensyu4_20 {

	public static void main(String[] args) {
		//キーボードから値を読み込むための宣言
		Scanner stdIn = new Scanner(System.in);
		//入力を促す
		System.out.println("何段の正方形を作成しますか：");
		//キーボードから値を読み込む
		int setNumber = stdIn.nextInt();
		//読み込んだ値以上になるまで改行する繰り返し文
		for(int i = 1; i <= setNumber; i++){
			//読み込んだ値の数だけ*を表示させる
			for(int j = 1; j <= setNumber; j++){
				//*を表示させる
				System.out.print("*");
			}
			//段落を変えるために改行を入れる
			System.out.println();
		}
	}
}
