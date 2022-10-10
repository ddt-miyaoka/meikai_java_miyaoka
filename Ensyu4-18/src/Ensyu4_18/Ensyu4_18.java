package Ensyu4_18;
//右に示すように、１からｎまでの整数値の2乗値を表示するプログラムを作成せよ。
import java.util.Scanner;

public class Ensyu4_18 {

	public static void main(String[] args) {
		//キーボードから値を読み込むための宣言
		Scanner stdIn = new Scanner(System.in);
		//入力を促す
		System.out.println("nの値：");
		//キーボードから値を読み込む
		int setNumber = stdIn.nextInt();
		//入力した値を超えるまで順番にその値と2乗の値を繰り返し表示する
		for(int i =1; i <= setNumber; i++){
			//入力した値とその2乗の値を表示する
			System.out.println(i + "の2乗は" + i*i);
		}
	}

}
