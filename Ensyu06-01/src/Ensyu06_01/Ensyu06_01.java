package Ensyu06_01;
//要素型がdouble型で要素数が5の配列を生成して、その全要素の値を表示するプログラムを作成せよ
public class Ensyu06_01 {

	public static void main(String[] args) {
		///要素型がdouble型で要素数が5の配列を生成
		double[] a = new double[5];
		//全ての要素の値を表示させるための繰り返し
		for(int i = 0; i < 5 ; i++){
			//表示させる数値は指定がないので、インデックス*0.1した値を表示
			System.out.println("double["+i+"] = " + i * 0.1);
		}
	}

}
