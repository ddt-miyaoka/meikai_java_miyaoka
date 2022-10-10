package Ensyu4_10;
//読み込んだ値が1未満であれば改行文字を出力しないようにList4-11を書き換えたプログラムを作成せよ
import java.util.Scanner;

public class Ensyu4_10 {

	public static void main(String[] args) {
		//キーボードから値を読み込むための宣言
		Scanner stdIn = new Scanner(System.in);
		//数字の入力を促す
		System.out.println("何個＊を表示しますか？");
		//キーボードから値を読み込む
		int n = stdIn.nextInt();

		//読み込んだ値に応じて＊を表示する処理を繰り返す
		for(int i = 0; i < n; i++)
			//*を表示する
			System.out.print('*');
		//もしも読み込んだ値が1未満だった場合改行を表示しない
		if (n < 1){
		}else{
			//読み込んだ値が1より大きい場合改行文字を表示する
			System.out.println();
		}
	}

}
