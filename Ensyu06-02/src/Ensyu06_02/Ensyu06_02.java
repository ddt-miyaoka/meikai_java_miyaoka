package Ensyu06_02;
//要素型がint型で要素数が5の配列の要素に対して、先頭から順に5，4，3，2，1を代入して表示するプログラムを作成せよ。
public class Ensyu06_02 {

	public static void main(String[] args) {
		//要素型がint型で要素数が5の配列を生成
		int[] a = new int[5];
		//全ての要素に値を代入していく繰り返し
		for(int i = 0; i < a.length; i++){
			//インデックスから要素数を引いた値を代入する
			a[i] = a.length - i;
			//代入した値を表示する
			System.out.println(a[i]);
		}
	}

}
