package Ensyu2_7;
//以下に示すプログラムを作成せよ。
//・1桁の正の整数値(すなわち1以上9以下の値)をランダムに生成して表示
//・1桁の負の整数値(すなわち-9以上-1以下の値)をランダムに生成して表示
//・2桁の正の整数値(すなわち10以上99以下の値)をランダムに生成して表示
import java.util.Random;

public class Ensyu2_7 {

	public static void main(String[] args) {
		//乱数を生成するための宣言
		Random rand = new Random();
		//ランダムに生成した1桁の正の整数値を代入する
		int firstNumber = rand.nextInt(9) + 1;
		//ランダムに生成した1桁の負の整数値を代入する
		int secondNumber = rand.nextInt(9) - 9;
		//ランダムに生成した2桁の正の整数値を代入する
		int thirdNumber = rand.nextInt(90) + 10;
		//1桁の正の整数値を表示する
		System.out.println("ランダムに生成した1桁の正の整数値=" + firstNumber);
		//1桁の負の整数値を表示する
		System.out.println("ランダムに生成した1桁の負の整数値=" + secondNumber);
		//2桁の正の整数値を表示する
		System.out.println("ランダムに生成した2桁の正の整数値=" + thirdNumber);
	}

}
