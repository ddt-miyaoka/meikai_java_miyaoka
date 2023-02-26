package Ensyu07_11;

import java.util.Scanner;

public class Ensyu07_11 {


	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		System.out.print("整数：");
		int x = stdIn.nextInt();
		System.out.print("シフトするビット数：");
		int n = stdIn.nextInt();

		System.out.print("整数 = ");
		printBits(x);
		System.out.print("\n x << n = ");
		printBits(x << n);
		System.out.print("\n x >> n = ");
		printBits(x >> n);

		int y = x;
		int z = x;

		for(int i = 0; i < n; i++){
			y = y*2;
		}
		System.out.print("\n y = ");
		printBits(y);

		for(int i = 0; i < n; i++){
			z = z/2;
		}
		System.out.print("\n z = ");
		printBits(z);

	}

	static void printBits(int x){
		for(int i = 31; i>=0; i--){
			System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
		}
	}
}
