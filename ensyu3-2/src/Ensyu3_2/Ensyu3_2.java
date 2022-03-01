package Ensyu3_2;
//二つの正の整数値を読み込んで、後者が全社の約数であれば『BはAの約数です。』と表示し、
//そうでなければ『BはAの約数ではありません。』と表示するプログラムを作成せよ。
import java.util.Scanner;

public class Ensyu3_2 {

	public static void main(String[] args) {
		//キーボードから値を取り込むための宣言
		Scanner stdIn = new Scanner(System.in);
		//整数の入力を促す
		System.out.println("整数A：");
		//入力した値を代入する
		int firstNumber = stdIn.nextInt();
		//もう一つの値の入力を促す
		System.out.println("整数B：");
		//入力した値を代入する
		int secondNumber = stdIn.nextInt();
		//もしfirstNumer割るsecondNumberが0であれば
		if(firstNumber % secondNumber ==0){
			//約数ということになるため約数ですと表示する
			System.out.println(secondNumber + "は" + firstNumber + "の約数です");
		//もしそうでなければ
		}else{
			//約数ではないということなので、約数ではないと表示する
			System.out.println(secondNumber + "は" + firstNumber + "の約数ではありません");
		}
	}

}
