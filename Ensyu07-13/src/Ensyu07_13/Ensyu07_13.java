package Ensyu07_13;

public class Ensyu07_13 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

	}
	static int set(int x, int pos){
		int a = 1;
		a = x << pos;
		x = x | a;
		return x;

	}
	static int reset(int x, int pos){
		int a = 1;
		a = x << pos;
		x = x ^ a;
		return x;
	}
	static int reverse(int x, int pos){
		int a = 1;
		a = x << pos;
		x =  ~x;
		return x;
	}
}
