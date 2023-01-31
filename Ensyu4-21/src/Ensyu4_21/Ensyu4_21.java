package Ensyu4_21;
//
import java.util.Scanner;

public class Ensyu4_21 {

	public static void main(String[] args) {
		//キーボードから値を読み込むための宣言
		Scanner stdIn = new Scanner(System.in);

		//一つ目の三角形の説明
		System.out.println("左上直角の3角形を表示します");
		//入力を促す
		System.out.print("段数は？");
		//段数を入力する
		int firstNumber = stdIn.nextInt();
		//入力した段数をもとに三角形の段数を制御するループ
		for(int i = 1; i <= firstNumber; i++){
			//条件をもとに*を表示させるためのループ
			for(int j = i; j <= firstNumber; j++){
				//*を表示させる
				System.out.print("*");
			}
			//ループの終わりで改行を入れる
			System.out.println("");
		}

		//二つ目の三角形の説明
		System.out.println("右下直角の3角形を表示します");
		//入力を促す
		System.out.print("段数は？");
		//段数を入力する
		int secondNumber = stdIn.nextInt();
		//入力した段数をもとに三角形の段数を制御するループ
		for(int k = 1; k <= secondNumber; k++){
			//条件をもとに*の前に空欄をはさみ三角形の形を変化させるためのループ
			for(int l =secondNumber; l > k; l--){
				//空欄を生成させる
				System.out.print(" ");
			}
			//条件をもとに*を表示させるためのループ
			for(int m = 1; m <= k; m++){
				//*を表示させる
				System.out.print("*");
			}
			//ループの終わりで改行を入れる
			System.out.println("");
		}

		//三つ目の三角形の説明
		System.out.println("右上直角の3角形を表示します");
		//入力を促す
		System.out.print("段数は？");
		//段数を入力する
		int thirdNumber = stdIn.nextInt();
		//入力した段数をもとに三角形の段数を制御するループ
		for(int n = 1; n <= thirdNumber; n++){
			//条件をもとに*の前に空欄をはさみ三角形の形を変化させるためのループ
			for(int o = thirdNumber-1; o > thirdNumber - n; o--){
				//空欄を生成させる
				System.out.print(" ");
			}
			//条件をもとに*を表示させるためのループ
			for(int p = n; p <= thirdNumber; p++){
				//*を表示させる
				System.out.print("*");
			}
			//ループの終わりで改行を入れる
			System.out.println("");
		}
	}

}
