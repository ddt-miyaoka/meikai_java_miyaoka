package Ensyu4_03;
//右に示すように、二つの整数値を読み込んで、小さいほうの数以上で大きいほうの数以下の全整数を小さいほうから順に表示するプログラムを作成せよ
import java.util.Scanner;

public class Ensyu4_03 {

	public static void main(String[] args) {
		//キーボードから値を読み込むための宣言
		Scanner stdInt = new Scanner(System.in);
		//一つ目の数字の入力を促す
		System.out.print("一つ目の値：");
		//一つ目の数字を入力
		int firstNumber = stdInt.nextInt();
		//二つ目の数字の入力を促す
		System.out.print("二つ目の値：");
		//二つ目の数字を入力
		int secondNumber = stdInt.nextInt();
		do{
			//もし一つ目の値が二つ目よりも大きければ
			if(firstNumber > secondNumber){
				//二つ目の値を順番に表示させる
				System.out.print(secondNumber+" ");
				//二つ目の数字に1を加算
				secondNumber++;
				//もし二つ目の数字が一つ目と同じ値にまで加算されたら
				if (firstNumber == secondNumber){
					//最後にその数字を出力する
					System.out.print(secondNumber+" ");
				}
			//もし一つ目の値が二つ目の値よりも小さければ
			}else if(firstNumber < secondNumber){
				//一つ目の値を順番に表示させる
				System.out.print(firstNumber+" ");
				//一つ目の値に1を加算
				firstNumber++;
				//もし一つ目の数字が二つ目と同じ値にまで加算されたら
				if (firstNumber == secondNumber){
					//最後にその数字を出力する
					System.out.print(firstNumber+" ");
				}
			}
		//一つ目と二つ目の数字が並ぶまで繰り返す
		}while(firstNumber != secondNumber );

	}

}
