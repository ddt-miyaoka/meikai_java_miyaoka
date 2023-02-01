package Ensyu06_07;
//List6-9は探索するキー値と同じ値の要素が複数個存在する場合、最も先頭に位置する要素を見つけるプログラムである。
//最も末尾側に位置する要素を見つけるプログラムを作成せよ
import java.util.Random;
import java.util.Scanner;

//
public class Ensyu06_07 {

	public static void main(String[] args) {
		//乱数を出力するための宣言
		Random rand = new Random();
		//キーボードから値を読み込むための宣言
		Scanner stdIn = new Scanner(System.in);

		//要素数を宣言
		final int n = 12;
		//宣言した要素数の配列を生成
		int[] a = new int[n];
		//生成した配列の要素に乱数を入れていく
		for(int i = 0; i < n; i++){
			//1~10の乱数を生成
			a[i] = rand.nextInt(10);
		}

		//配列の全要素の値を表示
		System.out.print("配列aの全要素の値\n{");
		//一つずつ要素の中の数字を表示していく
		for(int i = 0; i < n; i++){
			//要素の中の数字を出力
			System.out.print(a[i] + " ");
		}
		//全ての要素の出力が終わったら}で閉じる
		System.out.println("}");

		//入力を促す
		System.out.print("探す数値：");
		//見つける対象となる値を入力
		int key = stdIn.nextInt();

		//値が見つかった際何番目の要素かを表示する変数
		int arrayNumber = 0;
		//そもそも値が一つでも見つかったかを判定する変数
		boolean findNumber = false;
		//要素を一つずつ確認していく
		for(int i = 0; i < n; i++){
			//もしも要素の値と探す値が合致した場合
			if(a[i] == key){
				//見つけた要素数を更新する
				arrayNumber = i;
				//対象が見つかったのでTrueにする
				findNumber = true;
			}
		}
		//もしも一つでも対象となる値が見つかっていれば
		if(findNumber){
			//何番目の要素にあったかを表示させる
			System.out.println("それはa[" + arrayNumber + "]にあります。");
		//探した値が一つも見つからなければ
		}else{
			//見つからなかったことを表示させる
			System.out.println("それはありません。");
		}

	}

}
