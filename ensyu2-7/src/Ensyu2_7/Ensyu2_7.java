package Ensyu2_7;

import java.util.Random;

public class Ensyu2_7 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Random rand = new Random();
		int x = rand.nextInt(9) + 1;
		int y = rand.nextInt(9) - 9;
		int z = rand.nextInt(90) + 10;

		System.out.println("x=" + x);
		System.out.println("y=" + y);
		System.out.println("z=" + z);
	}

}
