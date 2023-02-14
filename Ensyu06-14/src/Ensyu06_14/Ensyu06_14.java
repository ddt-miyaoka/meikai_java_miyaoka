package Ensyu06_14;

import java.util.Random;
import java.util.Scanner;

public class Ensyu06_14 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Random rand = new Random();
		Scanner stdSt = new Scanner(System.in);
		String[] stringMonths = {"Junuaty", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		int checkMonth = 13;

		System.out.println("英語の月名を入力してください");

		while(true){
			int month = rand.nextInt(12);
			if(month == checkMonth){
				continue;
			}
			checkMonth = month;
			System.out.print(month + 1 + "月:");
			String answer = stdSt.next();
			if(answer.equals(stringMonths[month])){
				checkMonth = month;
				System.out.print("正解です。もう一度？1=Yes/0=No :");
				int check = stdSt.nextInt();
				if(check == 1){
					continue;
				}else if(check == 0){
					break;
				}
			}else{
				System.out.println("違います");
				continue;
			}
		}
	}
}
