package Ensyu06_16;

import java.util.Scanner;

public class Ensyu06_16 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[][] a = new int[4][3];
		int[][] b = new int[3][4];
		int[][] c = new int[4][4];
		Scanner stdIn = new Scanner(System.in);

		for(int i = 0; i < 4; i++){
			for(int j = 0; j < 3; j++){
				System.out.println("a[" + i + "][" + j +"]=  ");
				a[i][j] = stdIn.nextInt();
				c[i][j] += a[i][j];
			}
		}

		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 4; j++){
				System.out.println("b[" + i + "][" + j +"]=  ");
				b[i][j] = stdIn.nextInt();
				c[i][j] += b[i][j];
			}
		}
		for(int i = 0; i < 4; i++){
			for(int j = 0; j < 4; j++){
				System.out.println("c[" + i + "][" + j +"]=  " + c[i][j]);
			}
		}
	}

}
