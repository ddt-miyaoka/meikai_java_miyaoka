package Ensyu06_18;

import java.util.Scanner;

public class Ensyu06_18 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		System.out.println("行の値を入力してください:");
		int row = stdIn.nextInt();
		int[][] c = new int[row][];

		for(int i = 0; i < c.length; i++){
			System.out.println("列の値を入力してください:");
			int column = stdIn.nextInt();
			c[i] = new int[column];
		}

		for(int i = 0; i < c.length; i++){
			for(int j = 0; j < c[i].length; j++){
				System.out.println("要素の値を入力してください:");
				int number = stdIn.nextInt();
				c[i][j] = number;
				System.out.println("c["+ i + "][" + j + "] = " + c[i][j]);
			}
		}

	}

}
