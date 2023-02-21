package Ensyu07_01;

import java.util.Scanner;

public class Ensyu07_01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int num = signOf(n);
		System.out.print(num);

	}
	static int signOf(int n){
		int a = n;
		if(a > 0){
			return 1;
		}else if(a == 0){
			return 0;
		}else{
			return -1;
		}
	}

}
