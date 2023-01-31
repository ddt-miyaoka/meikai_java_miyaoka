package Ensyu06_04;
//List6-5を書き換えて、右に示すように盾向きの棒グラフで表示するプログラムを作成せよ。
//最下段には、インデックスを10で割った剰余を表示すること。
import java.util.Random;
import java.util.Scanner;

public class Ensyu06_04 {

	public static void main(String[] args) {
		//乱数の宣言
		Random rand = new Random();
		//キーボードから値を読み込むための宣言
		Scanner stdIn = new Scanner(System.in);
		//入力を促す
		System.out.print("要素数:");
		//要素数を入力
		int n = stdIn.nextInt();
		//入力した要素数の配列を生成
		int[] a = new int[n];

		//生成した配列全てに乱数を入れていく
		for(int i = 0; i < n; i++){
			//1~10の乱数を入れ込む
			a[i] = rand.nextInt(10);
		}

		//1～10までのどの数字かを確認する繰り返し
		for(int i = 0; i < 10; i++){
			//要素の中身を確認し、1～10のどの数値かを確認していく
			for(int j = 0; j < n; j++){
				//もしも最大値から配列の値を引いた数字が確認中の数字(i)以上の場合*を表示させる
				if(i >= (10 - a[j])){
					//*を表示
					System.out.print("*");
				}
				//条件に合わない場合、*の代わりに空白を入れる
				else{
					//空白を表示
					System.out.print(" ");
				}
				//一通り要素の確認が終わったあと、次の繰り返しに備えて改行する
				if(j == n -1){
					//表示を整えるため改行
					System.out.println();
				}
				else{
					//表示を整えるため間に空欄をはさむ
					System.out.print(" ");
				}
			}
		}

		//*の下にある線を表示させるための繰り返し
		for (int i = 0; i < n; i++){
			//-を表示させる
			System.out.print("-");
			//表示を整えるため、最後は-を一つ表示させないための条件
			if(i < n - 1){
				//最後の繰り返しではこれは表示させない
				System.out.print("-");
			}
		}
		//-を表示させた後に改行させる
		System.out.println();

		//最下段の、インデックスを10で割った剰余を表示させるための繰り返し
		for (int i = 0; i < n; i++){
			//インデックスを10で割った剰余を表示
			System.out.print(i%10);
			//数字の間に空欄を挟む。最後の数字の後は空欄を表示させない
			if(i < n - 1){
				//空欄を表示
				System.out.print(" ");
			}

		}
	}

}
