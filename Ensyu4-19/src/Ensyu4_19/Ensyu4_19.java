package Ensyu4_19;
//季節を求めるList4-1の月の読み込みにおいて、1～12以外の値が入力された場合は、再入力させるように修正したプログラムを作成せよ。
import java.util.Scanner;

public class Ensyu4_19 {

	public static void main(String[] args) {
		//キーボードから値を読み込むための宣言
		Scanner stdIn = new Scanner(System.in);
		//月の変数を宣言
		int month;
		//リトライ確認用の変数を宣言
		int retry;
		do{
			do{
				//入力を促す
			System.out.print("季節を求めます。何月ですか：");
			//月を入力する
			month = stdIn.nextInt();
			//月が1～12までの値かを確認し、1～12で無ければ再度入力を促す
			}while(month < 1 || month >= 13);
			//入力された値が３～５かどうかを確認
			if(month >= 3 && month <= 5){
				//３～５であれば春と表示する
				System.out.println("それは春です。");
			//入力された値が６～８かどうかを確認
			}else if(month >= 6 && month <= 8){
				//６～８であれば夏と表示する
				System.out.println("それは夏です。");
			//入力された値が９～１１かどうかを確認
			}else if (month >= 9 && month <= 11){
				//９～１１であれば秋と表示する
				System.out.println("それは秋です。");
			//入力された値が１２か１か２かどうかを確認
			}else if(month == 12 || month == 1 || month == 2){
				//１２か１か２であれば冬と表示する
				System.out.println("それは冬です。");
			}
			//もう一度季節を確認するかどうかを確認する
			System.out.print("もう一度？1...Yes/0...No：");
			//もう一度確認するかを入力する
			retry = stdIn.nextInt();
		//入力された値が1であれば繰り返す
		}while(retry ==1);
	}

}
