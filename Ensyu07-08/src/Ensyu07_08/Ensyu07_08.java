package Ensyu07_08;

import java.util.Random;
import java.util.Scanner;

public class Ensyu07_08 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		int first = stdIn.nextInt();
		int second = stdIn.nextInt();
		int rand = random(first, second);
		System.out.print(rand);

	}

	static int random(int a, int b){
		Random rand = new Random();
		if(b < a){
			return a;
		}
		int c = rand.nextInt(b - a) + a;
		return c;
	}
}
