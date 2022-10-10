package Ensyu4_24;
//正の整数値を読み込み、それが素数であるかどうかを判定するプログラムを作成せよ。素数とは2以上ｎ未満のいずれの数でも割り切ることのできない整数ｎのことである。
import java.util.Scanner;

public class Ensyu4_24 {

	public static void main(String[] args) {
		//キーボードから値を読み込むための宣言
		Scanner stdIn = new Scanner(System.in);
		//入力を促す
		System.out.println("整数を入力：");
		int setNumber = stdIn.nextInt();
		//素数かどうか判定するためのループ
		for(int i = 2; setNumber >= i; i++){
			//もし入力した値と一致する場合それは素数
			if(setNumber ==  i){
				//素数と表示する
				System.out.println("素数です");
			//割り切れるかどうかを確認し、割り切れたら素数ではない
			}else if(setNumber %  i == 0){
				//素数ではないと表示する
				System.out.print("素数ではありません");
				break;
			}
		}
	}

}
