package Ensyu4_17;
//読み込んだ整数値のすべての約数を表示するList4-13を書き換えて、約数の表示が終わった後に、約数の個数を表示するプログラムを作成せよ
import java.util.Scanner;

public class Ensyu4_17 {

	public static void main(String[] args) {
		//キーボードから値を読み込むための宣言
		Scanner stdIn = new Scanner(System.in);

		//入力を促す
		System.out.print("整数値：");
		//キーボードから値を入力
		int setNumber = stdIn.nextInt();
		//約数の数を代入する変数を宣言
		int countNumber = 0;

		//入力した値に達するまで繰り返し、約数かどうかを判定していく
		for(int i = 1; i <= setNumber; i++)
			//もし余りが0であれば、約数なので表示させる
			if(setNumber % i ==0){
				//約数を表示
				System.out.println(i);
				//約数の合計の数を1増やす
				countNumber += 1;
			}
		//最終的な約数の合計を表示させる
		System.out.println("約数は" + countNumber + "です");
	}

}
