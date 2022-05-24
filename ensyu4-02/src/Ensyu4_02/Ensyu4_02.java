package Ensyu4_02;
//2桁の整数値(10～99)を当てさせる数当てゲームを作成せよ
import java.util.Random;
import java.util.Scanner;

public class Ensyu4_02 {

	public static void main(String[] args) {
		//キーボードから値を入力するための宣言
		Scanner stdInt = new Scanner(System.in);
		//ランダムに値を取得するための宣言
		Random randInt = new Random();

		//10～99の範囲でランダムに値を取得
		int randomNumber = randInt.nextInt(90)+10;
		//数字の入力を促す
		System.out.println("10～99の値を当ててください");
		//入力した数字を代入するための変数を宣言
		int setNumber;
		do{
			//数字を入力
			setNumber = stdInt.nextInt();
			//入力した値がランダムな値よりも大きければ
			if(setNumber > randomNumber){
				//大きいことを伝える
				System.out.println("入力した値が大きいです");
			//入力した値がランダムな値よりも小さければ
			}else if(setNumber < randomNumber){
				//小さいことを伝える
				System.out.println("入力した値が小さいです");
			}
		//入力した値がランダムで取得した値と合致するまで繰り返す
		}while(setNumber != randomNumber);
		//正解した場合は正解を表示する
		System.out.println("正解です。"+ "答えは" + randomNumber + "でした");
	}

}
