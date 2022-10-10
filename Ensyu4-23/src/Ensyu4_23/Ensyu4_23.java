package Ensyu4_23;

import java.util.Scanner;

public class Ensyu4_23 {

	public static void main(String[] args) {
		//キーボードから値を読み込むための宣言
		Scanner stdIn = new Scanner(System.in);
		//入力を促す
		System.out.println("何段のピラミッドにしますか？：");
		//段数を入力する
		int n = stdIn.nextInt();
		//入力した段数をもとにピラミッドを生成するためのループ
		for(int i = 1; i <= n; i++){
			//空欄を生成し、ピラミッドの形を整えるためのループ
			for(int j = i; j <= n -1; j++){
				//空欄を生成
				System.out.print(" ");
			}
			//条件をもとに*を表示させるためのループ
			for(int k = 1; k <= (i -1 ) * 2 + 1; k++){
				//*を表示
				System.out.print(i % 10);
			}
			//ループの終わりで改行を入れる
			System.out.println();
		}
	}

}
