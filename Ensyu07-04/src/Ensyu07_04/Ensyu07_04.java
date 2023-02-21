package Ensyu07_04;

import java.util.Scanner;

public class Ensyu07_04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		int num = stdIn.nextInt();
		int sum = sumUp(num);
		System.out.print(sum);
	}
	static int sumUp(int n){
		int sum = 0;
		for(int i = 0; i <= n; i++){
			sum += i;
			
		}
		return sum;
	}
}
