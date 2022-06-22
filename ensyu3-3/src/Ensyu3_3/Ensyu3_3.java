package Ensyu3_3;
//List3-5の最後のelseを、else if(n == 0)に変更したらどうなるかを検証せよ
import java.util.Scanner;

public class Ensyu3_3 {

	public static void main(String[] args) {
		//キーボードから値を入力するための宣言
		Scanner stdIn = new Scanner(System.in);
		//整数の入力を促す
		System.out.print("整数値：");
		//キーボードから入力した値を代入する
		int firstNumber = stdIn.nextInt();
		//もし入力した値が0よりも大きければ
		if(firstNumber > 0){
			//それは正の値であることを表示させる
			System.out.println("その値は正です");
		//もし入力した値が0より小さければ
		}else if (firstNumber < 0){
			//それは負の値であることを表示させる
			System.out.println("その値は負です");
		//もし入力した値が0とであれば
		}else if(firstNumber == 0){
			//その値は0だと表示させる
			System.out.println("その値は0です");
		}
	}

}
