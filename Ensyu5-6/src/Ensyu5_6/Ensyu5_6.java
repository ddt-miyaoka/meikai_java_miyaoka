package Ensyu5_6;
//List5-9のように、float型の変数を0.0から1.0まで0.001ずつ増やしていく様子と、List5-10のように、int型の変数を0から1000までインクリメントした値を1000で割った値を求める様子を横に並べて表示するプログラムを作成せよ。
public class Ensyu5_6 {

	public static void main(String[] args) {
		//例文と同じように表示を整える
		System.out.println("float       int");
		//例文と同じように表示を整える
		System.out.println("----------------");
		//float型の変数を0.0から1.0まで0.001ずつ増やし、int型の変数を0から1000までインクリメントする繰り返し文
		for(float x = 0.0F, i = 0.0F; x <= 1.0F; x += 0.001F, i++){
			//インクリメントした値を1000で割る
			float intNum =(float) i / 1000;
			//表示する桁数を小数点7桁にした状態で、Float型の値とint型の値を出力する
			System.out.println(String.format("%.7f  %.7f", x,intNum));
		}
	}

}
