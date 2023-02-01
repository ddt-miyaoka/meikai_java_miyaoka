package Ensyu06_05;
//配列の要素数と、個々の要素の値を読み込んで、右のように各要素の値を表示するプログラムを作成せよ。
//表示の形式は、初期化子と同じ形式、すなわち、各要素の値をコンマで区切って｛｝で囲んだ形式とすること
import java.util.Scanner;

public class Ensyu06_05 {

	public static void main(String[] args) {
		//キーボードから値を読み込むための宣言
		Scanner stdIn = new Scanner(System.in);
		//入力を促す
		System.out.print("要素数：");
		//要素数を入力
		int n = stdIn.nextInt();
		//入力した要素数の配列を生成
		int[] a = new int[n];
		//生成した配列の各要素に入れる値を入力していく
		for(int i = 0; i < a.length; i++){
			//入力する要素を表示
			System.out.print("a["+ i +"] = ");
			//要素に代入する値を入力
			a[i] = stdIn.nextInt();
		}
		//入力した値を初期化子と同じ形式で表示させる
		System.out.print("a = {");
		//各要素の値を出力していく
		for(int i = 0; i < a.length; i++){
			//最後の要素の場合は数字を出力と共に]を出力するようにする
			if(i == a.length -1){
				//最後の要素を出力
				System.out.print(a[i] + "}");
				//ここでループを抜ける
				break;
			}
			//要素の数字を出力しつつ、コンマも出力する
			System.out.print(a[i] + ",");
		}

	}

}
