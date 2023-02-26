package Ensyu07_09;

import java.util.Scanner;

public class Ensyu07_09 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		int answer = readPlusInt();
		System.out.print(answer);

	}

	static int readPlusInt(){
		Scanner stdIn = new Scanner(System.in);
		int answer;
		do{
			System.out.print("正の整数値:");
			answer = stdIn.nextInt();
		}while(answer < 0);
		return answer;
	}
}
