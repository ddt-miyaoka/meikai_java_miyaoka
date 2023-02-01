package Ensyu06_06;
//テストの点数の合計点・平均点・最高点・最低点を表示するプログラムを作成せよ。人数と点数は、キーボードから値を読み込むこと
import java.util.Scanner;

public class Ensyu06_06 {

	public static void main(String[] args) {
		//キーボードから値を読み込むための宣言
		Scanner stdIn = new Scanner(System.in);
		//人数の入力を促す
		System.out.print("人数：");
		//人数を入力
		final int ninzu = stdIn.nextInt();
		//入力した人数の数の要素数を持った配列を生成
		int[] tensu = new int[ninzu];

		//1人ずつ順番に点数を入力していく
		System.out.println(ninzu + "人の点数を入力せよ");
		//全要素に値を入力するための繰り返し
		for(int i = 0; i < ninzu; i++){
			//入力を促す
			System.out.print(i + 1 + "人目の点数を入力：");
			//テストの点数を入力
			tensu[i] = stdIn.nextInt();
		}

		//合計
		int sum = 0;
		//全ての要素の値を足していき、合計を求める
		for(int i = 0; i < ninzu; i++){
			//要素の値を合計に加算する
			 sum += tensu[i];
		}

		//最大値
		int max = tensu[0];
		//全ての要素の値と比較していき、より大きい数字があれば最大値を更新する
		for(int i = 1; i < ninzu; i++){
			//確認している要素の値が最大値より大きければ最大値を更新
			if(tensu[i] > max){
				//最大値を更新
				max = tensu[i];
			}
		}
		//最低値
		int min = tensu[0];
		//全ての要素の値と比較していき、より小さい数字があれば最低値を更新する
		for(int i = 1; i < ninzu; i++){
			//確認している要素の値が最低値よりも小さければ最低値を更新
			if(tensu[i] < min){
				//最低値を更新
				min = tensu[i];
			}
		}
		//合計を表示させる
		System.out.println("合計点は" + sum + "点です。");
		//平均を表示させる
		System.out.println("平均点は" + (double)sum/ninzu + "点です。");
		//最大値を表示させる
		System.out.println("最高点は" + max + "点です。");
		//最低値を表示させる
		System.out.println("最低点は" + min + "点です。");
	}

}
