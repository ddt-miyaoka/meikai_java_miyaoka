package Ensyu2_10;
//右に示すように、名前の姓と名とを個別にキーボードから読み込んで、挨拶を行うプログラムを作成せよ。
import java.util.Scanner;

public class Ensyu2_10 {

	public static void main(String[] args) {
		//キーボードから入力した文字列を読み込むための宣言
		Scanner stdIn = new Scanner(System.in);
		//姓の入力を促す
		System.out.print("姓：");
		//キーボードから入力した値を代入する
		String lastName = stdIn.next();
		//名の入力を促す
		System.out.print("名：");
		//キーボードから入力した値を代入する
		String firstName = stdIn.next();
		//入力した値を問題に沿った形で表示させる
		System.out.println("こんにちは" + lastName + firstName + "さん。");
	}

}
