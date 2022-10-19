package Ensyu4_06;
//読み込んだ値が1未満であれば改行文字を出力しないようにList4-7とList4-8を書き換えたプログラムをそれぞれ作成せよ
import java.util.Scanner;

public class Ensyu4_06 {

	public static void main(String[] args) {
		//キーボードから値を読み込むための宣言
		Scanner stdIn = new Scanner(System.in);
		//list4-7のプログラムを記載する
		System.out.print("何個＊を表示しますか：");
		//表示する数を入力する
		int n = stdIn.nextInt();
		//繰り返しの判定のための数字を設定
		int i = 0;
		//入力した値が規定数になるまで値を表示する
		while(i < n){
			//*を表示する
			System.out.print('*');
			//次のループのため加算する
			i++;
		}
		//入力した値が1未満であれば改行文字を表示しないためのIF
		if(n < 0){
			//入力した値が1以上のため改行文字を表示する
			System.out.println();
		}

		//ここから先がlist4-8に該当する個所
		System.out.print("何個＊を表示しますか：");
		//表示する数を入力する
		int x = stdIn.nextInt();
		//繰り返しの判定のための数字を設定
		int y = 1;
		//入力した値が繰り返しの条件を満たす限り表示する
		while(y <= x){
			//*を表示する
			System.out.print('*');
			//次のループのため加算する
			y++;
		}
		//入力した値が1未満であれば改行文字を表示しないためのIF
		if(x > 0){
			//入力した値が1以上のため改行文字を表示する
			System.out.println();
		}
	}

}
