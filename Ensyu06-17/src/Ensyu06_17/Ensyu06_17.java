package Ensyu06_17;

import java.util.Scanner;

public class Ensyu06_17 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[][] array = new int[6][2];
		Scanner stdIn = new Scanner(System.in);
		int kokugo = 0;
		int suugaku = 0;

		for(int i = 0; i < 6; i++){
			for(int j = 0; j < 2; j++){
				if(j ==0){
					System.out.print(i + 1 + "人目の国語の点数を入力してください：");
					array[i][j] = stdIn.nextInt();
				}else if(j == 1){
					System.out.print(i + 1  + "人目の数学の点数を入力してください：");
					array[i][j] = stdIn.nextInt();
				}
			}
		}

		for(int i = 0; i < 6; i++){
			for(int j = 0; j < 2; j++){
				System.out.println(i + "人目の平均点：" + (int)array[i][0] + (int)array[i][1]);
				if(j ==0){
					kokugo += array[i][j];
				}else if(j ==1){
					suugaku += array[i][j];
				}
			}
		}
		System.out.println("国語の平均点：" + kokugo/6);
		System.out.println("数学の平均点：" + suugaku/6);

	}
}
