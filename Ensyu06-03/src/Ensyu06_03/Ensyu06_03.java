package Ensyu06_03;
//要素型がdouble型で要素数が5の配列の要素に対して、先頭から順に1.1，2.2，3.3，4.4，5.5を代入して表示するプログラムを作成せよ。
public class Ensyu06_03 {

	public static void main(String[] args) {
		//要素型がdouble、要素数が5の配列を生成
		double[] a = new double[5];
		//配列の要素の数だけ繰り返す
		for(int i = 0; i < a.length; i++){
			//先頭から順に値を入れていく
			a[i] = 1.1 + (i * 1.1);
			//要素に入れた値を表示させる
			System.out.println(a[i]);
		}
	}

}
