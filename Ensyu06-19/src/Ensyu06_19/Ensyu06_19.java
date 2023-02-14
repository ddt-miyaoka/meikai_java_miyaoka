package Ensyu06_19;

import java.util.Scanner;

public class Ensyu06_19 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);

		System.out.println("クラス数：");
		int classNum = stdIn.nextInt();

		int[][] c = new int[classNum][];


		for(int i = 0; i < c.length; i++){
			System.out.println(i + 1 + "組の人数：");
			int student = stdIn.nextInt();
			c[i] = new int[student];
			for(int j = 0; j < student; j++){
				System.out.println(i + 1 + "組" + (j + 1) + "番の点数：");
				 int score =  stdIn.nextInt();
				c[i][j] = score ;
			}
		}

		int allSum = 0;
		int allStudent = 0;
		System.out.println("  組 |    合計   平均");
		System.out.println("-----+----------------");
		for(int i = 0; i < c.length; i++){
			int classSum = 0;
			for(int j = 0; j < c[i].length; j++){
				classSum += c[i][j];
			}
			System.out.println((i + 1) +" 組 |" + "   "+ classSum + "   " + classSum/c[i].length);
			allSum += classSum;
			allStudent += c[i].length;
		}
		System.out.println("-----+----------------");
		System.out.println("  計 |-----"+ allSum + "---" + allSum/allStudent  + "--------");
	}

}
