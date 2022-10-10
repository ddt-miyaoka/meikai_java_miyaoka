package Ensyu4_16;
//読み込んだ個数だけ*を表示するList4-11を書き換えて、5個表示するごとに改行するプログラムを作成せよ。
import java.util.Scanner;

public class Ensyu4_16 {

	public static void main(String[] args) {
		//キーボードから値を読み込むための宣言
		Scanner stdIn = new Scanner(System.in);
		//入力を促す
		System.out.println("何個*を表示しますか？");
		//入力した値を受け取る
		int firstNumber = stdIn.nextInt();
		//入力した数だけ*を出すためのfor文
		for(int i =0; i < firstNumber; i++){
		//もしiの値が5で割り切れ、かつ0でなければ5個表示と判断
		if(i % 5 ==0 && i!=0 ){
			//改行をはさむ
			System.out.println();
			}
		//*を表示する
		System.out.print("*");
		}
	}

}
