package Ensyu07_32;

public class Ensyu07_32 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		byte a = 1;
		short b = 1;
		int c = 20;
		long d = 10;
		printBits(a);
		System.out.println();
		printBits(b);
		System.out.println();
		printBits(c);
		System.out.println();
		printBits(d);
	}
	static void printBits(byte x){
		for(int i = 31; i >= 0; i--){
			System.out.print(((x >>> i & 1) == 1) ? "1" : "0");
		}
	}
	static void printBits(short x){
		for(int i = 31; i >= 0; i--){
			System.out.print(((x >>> i & 1) == 1) ? "1" : "0");
		}
	}
	static void printBits(int x){
		for(int i = 31; i >= 0; i--){
			System.out.print(((x >>> i & 1) == 1) ? "1" : "0");
		}
	}
	static void printBits(long x){
		for(int i = 31; i >= 0; i--){
			System.out.print(((x >>> i & 1) == 1) ? "1" : "0");
		}
	}
}
