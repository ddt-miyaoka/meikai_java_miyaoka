package Ensyu3_4;
//二つの整数a,bに値を読み込んで、その大小関係を以下のいずれかで表示するプログラムを作成せよ。
//『aのほうがおおきいです』、『bのほうが大きいです』、『aとbは同じ値です。』
import java.util.Scanner;

public class Ensyu3_4 {

	public static void main(String[] args) {
		//キーボードから値を読み取るための宣言
		Scanner stdInt = new Scanner(System.in);
		//aの値の入力を促す
		System.out.println("aの値：");
		//キーボードから読み込んだ値をaに読み込む
		int firstNumber = stdInt.nextInt();
		//bの値の入力を促す
		System.out.println("bの値：");
		//キーボードから読み込んだ値をbに読み込む
		int secondNumber = stdInt.nextInt();
		//aとbの値は等しいかを確認
		if(firstNumber == secondNumber){
			//aとbは同じ値です。と表示する
			System.out.println("aとbは同じ値です。");
		//aとbは等しくはなくかつaのほうが大きいかを確認
		}else if(firstNumber > secondNumber){
			//aのほうがおおきいですと表示する
			System.out.println("aのほうがおおきいです");
		//aとbは同じ値でもなく、aのほうがbより大きいわけでもない
		}else{
			//bのほうが大きいですと表示する
			System.out.println("bのほうが大きいです");
		}
	}
}
