package ensyu2_1;
//List2-6の2の箇所を、少数部をもつ実数値をxとyに代入するように変更して、その結果を考察せよ。
public class Ensyu2_1 {

	public static void main(String[] args) {
		//int型の整数xとyを宣言
		int x, y;
		//宣言したxに少数部を持つ値を代入する
		x = 6.3;
		//宣言したxに少数部を持つ値を代入する
		y = 1.8;
		//xを表示する
		System.out.println("xの値は" + x + "です。");
		//yを表示する
		System.out.println("yの値は" + y + "です。");

		//結果、型の不一致: double から int には変換できませんとなりエラー
	}

}
