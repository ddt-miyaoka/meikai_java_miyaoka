package Ensyu2_9;
//以下に示すプログラムを作成せよ(実数値の乱数の生成にはnextDouble()を使うこと)
//・0.0以上1.0未満の実数値をランダムに生成して表示
//・0.0以上10.0未満の実数値をランダムに生成して表示
//・-1.0以上1.0未満の実数値をランダムに生成して表示
import java.util.Random;

public class Ensyu2_9 {

	public static void main(String[] args) {
		//乱数の生成に必要な宣言
		Random rand = new Random();
		//0.0以上1.0未満の実数値をランダムに生成して代入
		double firstNumber = rand.nextDouble();
		//生成した0.0以上1.0未満の実数値を表示する
		System.out.println(firstNumber);
		//0.0以上10.0未満の実数値をランダムに生成して代入
		double secondNumber = rand.nextDouble()*10;
		//生成した0.0以上10.0未満の実数値を表示する
		System.out.println(secondNumber);
		//-1.0以上1.0未満の実数値をランダムに生成して代入
		double thirdNumber = rand.nextDouble()-1;
		//生成した-1.0以上1.0未満の実数値を表示する
		System.out.println(thirdNumber);

	}

}
