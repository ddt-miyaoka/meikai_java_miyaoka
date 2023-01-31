package Ensyu4_25;
//合計だけではなく平均も求めるようにList4-17およびList4-18のプログラムを書き換えよ
import java.util.Scanner;

public class Ensyu4_25 {

	public static void main(String[] args) {
		//キーボードから値を読み込むための宣言
		Scanner stdIn = new Scanner(System.in);
		//List4-17のプログラムの開始
		System.out.println("整数を加算します");
		//入力を促す
		System.out.println("何個加算しますか？");
		//値を入力する
		int n = stdIn.nextInt();
		//合計の変数を宣言
		int sum = 0;
		//何個の整数を足したかカウントする変数を宣言
		int countNumber = 0;
		//入力した数の整数を足していくループ
		for(int i =0; i < n; i++){
			//入力を促す
			System.out.print("整数(0で終了)：");
			//値を入力する
			int t = stdIn.nextInt();
			//入力した値が0であればその時点でループを終わる
			if(t == 0){
				break;
			}
			//入力した値を合計に加算
			sum += t;
			//合計を加算した際にカウントを増やす
			countNumber++;
		}
		//合計を表示する
		System.out.println("合計は" + sum + "です");
		//平均を表示する
		System.out.println("平均は"+ sum / countNumber + "です");

		//List4-18のプログラムの開始
		System.out.println("合計値が1000になるまで値を加算");
		//入力を促す
		System.out.println("整数を加算します");
		//入力を促す
		System.out.println("何個加算しますか？");
		//値を入力する
		n = stdIn.nextInt();
		//合計の値をList4-17から初期化する
		sum = 0;
		//カウントを初期化する
		countNumber = 0;
		//合計値が1000になるまでの値を加算するループ
		for(int j =0; j < n; j++){
			//入力を促す
			System.out.print("整数：");
			//値を入力
			int t = stdIn.nextInt();
			//入力した値とこれまでの合計が1000を超えた場合ループを終わる
			if(sum + t > 1000){
				//1000を超えたことを説明する
				System.out.println("合計が1000を超えました");
				System.out.println("最後の数値は無視します");
				break;
			}
			//入力した値を合計に加算
			sum += t;
			//合計を加算した際にカウントを増やす
			countNumber++;
		}
		//合計を表示する
		System.out.println("合計は" + sum + "です");
		//平均を表示する
		System.out.println("平均は"+ sum / countNumber + "です");
	}
}
