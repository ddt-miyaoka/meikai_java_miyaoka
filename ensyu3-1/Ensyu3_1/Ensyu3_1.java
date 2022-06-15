import java.util.Scanner;

public class Ensyu3_1 {
//右に示すように、整数値を読み込んで、その絶対値を求めて表示するプログラムを作成せよ
	public static void main(String[] args) {
		//キーボードからの値を読み込むための宣言
		Scanner stdIn = new Scanner(System.in);
		//整数値の入力を促す
		System.out.println("整数値：");
		//キーボードからの値を代入する
		int firstNumber = stdIn.nextInt();
		//入力された値が正の値かどうかを判定する
		if(firstNumber < 0){
			//もしマイナスであったのならば-1を乗算した値を表示する
			System.out.println("その絶対値は"+ firstNumber * -1 +"です");
		//入力された値が整数であればそのまま表示する
		}else{
		//絶対値を表示する
		System.out.println("その絶対値は"+ firstNumber+"です");
		}
	}

}
