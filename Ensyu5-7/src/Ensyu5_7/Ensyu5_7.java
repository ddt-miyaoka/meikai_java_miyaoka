package Ensyu5_7;
//0.0から1.0まで0.001おきに、その値と、その値の2錠を表示するプログラムを作成せよ
public class Ensyu5_7 {

	public static void main(String[] args) {
		//0.0から1.0まで0.001ずつ処理する繰り返し文
		for(float x = 0; x < 1; x += 0.001f){
			//xとその2乗を表示。表示する際は0.001ごとなので小数点は下3桁までしか表示しないよう整えてから出力する
			System.out.println(String.format("%.3f  %.3f", x,( x * x)));
		}

	}

}
