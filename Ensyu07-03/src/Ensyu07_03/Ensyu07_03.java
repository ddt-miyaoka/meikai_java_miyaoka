package Ensyu07_03;

import java.util.Scanner;

public class Ensyu07_03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		int c = stdIn.nextInt();
		
		int med = med(a,b,c);
		
		System.out.println(med);
	}
	static int med(int a, int b, int c){
		int med = a;
		if(a < b && b >c && a > c){
			med = a;
		}else if(b > c && c > a &&  b > a){
			med = c;
		}else{
			med = b;
		}
		return med;
	}
}
