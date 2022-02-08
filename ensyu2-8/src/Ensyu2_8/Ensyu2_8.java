package Ensyu2_8;

import java.util.Random;
import java.util.Scanner;

public class Ensyu2_8 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		Random rand = new Random();
		System.out.print("整数値：");
		int x = stdIn.nextInt();
		int y = rand.nextInt(11)-5;
		int z= x + y;
		System.out.println("その値の±5の乱数を生成しました。それは" + z + "です。");
	}

}
