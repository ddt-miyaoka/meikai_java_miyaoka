package Ensyu4_13;
//1からｎまでの和を求めるList4-10をfor文で実現せよ
import java.util.Scanner;

public class Ensyu4_13 {

	public static void main(String[] args) {
		//値をキーボードから入力するための宣言
		Scanner stdIn = new Scanner(System.in);

		//説明
		System.out.println("1からｎまでの和を求めます");
		//数字の入力を促す
		System.out.print("nの値：");
		//キーボードから入力した値を入れる
		int n = stdIn.nextInt();
		//合計の値
		int sum = 0;
		//1からｎになるまでSumにiの値を繰り返し加える処理
		for(int i = 1; i <= n; i++){
			//合計の値を足していく
			sum += i;
		}
		//最終的な値を表示させる
		System.out.println(sum);
		}
}
