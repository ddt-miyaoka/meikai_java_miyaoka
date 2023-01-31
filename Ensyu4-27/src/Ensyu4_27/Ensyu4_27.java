package Ensyu4_27;
//List4-3の数当てゲームのプレーヤが入力できる回数に制限を設けたプログラムを作成せよ。制限回数内にあてられなかった場合は、正解を表示してゲームを終了すること
import java.util.Random;
import java.util.Scanner;

public class Ensyu4_27 {

	public static void main(String[] args) {
		//ランダムな値を生成するための宣言
		Random rand = new Random();
		//キーボードから値を読み込むための宣言
		Scanner stdIn = new Scanner(System.in);

		//ランダムな値を生成
		int no = rand.nextInt(100);
		//ゲームの説明
		System.out.println("数当てゲーム開始");
		//入力回数の設定を促す
		System.out.println("数字の入力は何回までにしますか？");
		//入力回数を設定
		int limitNumber = stdIn.nextInt();
		//ゲームの案内
		System.out.println("0～99の数をあててください");

		//入力した値を格納する変数
		int x;

		//正解時にループから抜け出すためラベルをセット
		Outer:
		do{
			//入力を促す
			System.out.println("いくつかな：");
			//規定回数のみ数字の入力を受け付けるループ
			for(int i = 1; i < limitNumber; i++){
				//数字を入力する
				x = stdIn.nextInt();
				//入力した値が正解より大きい場合
				if(x > no){
					//正解はもっと小さいことを表示
					System.out.println("もっと小さな数だよ");
				//入力した値が正解より小さい場合
				}else if(x < no){
					//正解はもっと大きいことを表示
					System.out.println("もっと大きな数だよ");
				//それ以外、つまりは値が大きくも小さくもない等しい場合
				}else{
					//正解だと表示する
					System.out.println("正解です");
					//これ以上入力は不要のためループから抜ける
					break Outer;
				}
			}
			//規定回数までに正解できなかった場合以下の表示を行う
			System.out.println("規定回数を超えたので正解を表示します");
			//正解を表示
			System.out.println("正解は"+ no);
			//規定回数に達したためループから抜けて処理を終わる
			break;
		}while (x != no);
	}
}
