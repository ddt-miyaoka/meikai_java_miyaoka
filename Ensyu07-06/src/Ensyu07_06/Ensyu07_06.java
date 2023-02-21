package Ensyu07_06;

import java.util.Scanner;

public class Ensyu07_06 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		int month = stdIn.nextInt();
		printSeason(month);
	}

	static void printSeason(int m){
		if(m == 3 || m == 4 || m == 5){
			System.out.print("春");
		}else if(m == 6 || m == 7 || m == 8){
			System.out.print("夏");
		}else if(m == 9 || m == 10 || m == 11){
			System.out.print("秋");
		}else if(m == 12 || m == 1 || m == 2){
			System.out.print("冬");
		}
	}
}
