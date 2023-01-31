package Ensyu4_26;
//合計だけでなく平均も求めるようにList4-19のプログラムを書き換えよ。なお、読み込んだ負の数の個数は平均を求める際の分母から除外すること
import java.util.Scanner;

public class Ensyu4_26 {

	public static void main(String[] args) {
		//キーボードから値を読み込むための宣言
		Scanner stdIn = new Scanner(System.in);
		//List4-19のプログラム
		System.out.println("整数を加算します");
		//入力を促す
		System.out.println("何個加算しますか？");
		//値を入力
		int n = stdIn.nextInt();
		//合計の値
		int sum = 0;
		//加算した数をカウントするための変数
		int countNumber = 0;

		//入力した数の整数を加算するためのループ
		for(int i = 0; i < n; i++){
			//入力を促す
			System.out.println("整数：");
			//値を入力
			int t = stdIn.nextInt();
			//値が負の数であれば数値を加算しない
			if(t < 0){
				//加算しないことを表示する
				System.out.println("負の数は加算しません");
				//次のループへ進む
				continue;
			}
			//値が正の数であれば合計に入力した値を加算
			sum += t;
			//合計を加算したさいにカウントを増やす
			countNumber++;
		}
		//合計を表示する
		System.out.println("合計は" + sum + "です");
		//平均を表示する
		System.out.println("平均は"+ sum / countNumber + "です");
	}

}
