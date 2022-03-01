package Ensyu3_18;
//月を1～12ｍの整数値として読み込んで、それに対応する季節を表示するプログラムを作成せよ
import java.util.Scanner;

public class Ensyu3_18 {

	public static void main(String[] args) {
		//キーボードから値を読み込むための宣言
		Scanner stdInt = new Scanner(System.in);
		//入力を促す
		System.out.println("1月～12月までの値を入力してください：");
		//入力された値を代入する
		int monthNumber = stdInt.nextInt();
		//入力された値をもとに季節を判定する
		switch(monthNumber){
			//入力された値が12、1、2のいずれかの場合
			case 12:
			case 1:
			case 2:
				//季節は冬とする
				System.out.println("冬");
			//Switch文を抜ける
			break;
			//入力された値が3、4、5、のいずれかの場合
			case 3:
			case 4:
			case 5:
				//季節は春とする
				System.out.println("春");
			//Switch文を抜ける
			break;
			//入力された値が6、7、8のいずれかの場合
			case 6:
			case 7:
			case 8:
				//季節は夏とする
				System.out.println("夏");
			//Switch文を抜ける
			break;
			//入力された値が9、10、11のいずれかの場合
			case 9:
			case 10:
			case 11:
				//季節は秋とする
				System.out.println("秋");
			//Switch文を抜ける
			break;
			//上記以外の値が入力された場合
			default:
				//それは月を示す値ではないため範囲外と伝える
				System.out.println("範囲外の値が入力されました");
			//Switch文を抜ける
			break;
		}
	}

}
