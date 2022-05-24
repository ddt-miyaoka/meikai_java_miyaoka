package Ensyu4_01;
//読み込んだ整数値の符号を判定するList3-5のプログラムを、好きなだけ何度でも繰り返して入力・表示できるようにしたプログラムを作成せよ
import java.util.Scanner;

public class Ensyu4_01 {
	public static void main(String[] args) {
		//キーボードから値を読み込むための宣言
		Scanner stdInt = new Scanner(System.in);
		//繰り返し判定のための変数の宣言
		int retryNumber;
		//繰り返し文の始まり
		do{
			//整数の入力を促す
			System.out.println("整数値：");
			//キーボードから値を読み込む
			int firstNumber = stdInt.nextInt();
			//入力した値を判定
			if(firstNumber > 0){
				//0以上であれば正と表示
				System.out.println("その値は正です");
			//値を判定
			}else if (firstNumber < 0){
				//0以下であれば負と表示
				System.out.println("その値は負です");
			//それ以外であれば
			}else{
				//0だと表示する
				System.out.println("その値は0です");
			}
			//繰り返すかどうかの判断を促す
			System.out.println("終了する場合は0を、繰り返す場合は1を入力してください");
			//キーボードから値を入力
			retryNumber = stdInt.nextInt();
		//入力した値が1であれば繰り返し、それ以外であれば終了する
		}while(retryNumber == 1);
	}
}
