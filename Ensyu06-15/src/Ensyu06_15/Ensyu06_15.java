package Ensyu06_15;

import java.util.Random;
import java.util.Scanner;

public class Ensyu06_15 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		String[] stringWeek = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
		String[] jWeek = {"月曜日","火曜日","水曜日","木曜日","金曜日","土曜日","日曜日"};
		int checkNum = 8;

		System.out.println("英語の曜日名を小文字で入力してください");
		while(true){
			int Num = rand.nextInt(7);
			if(Num == checkNum){
				continue;
			}
			checkNum = Num;
			System.out.print(jWeek[Num] + ":");
			String answer = stdIn.next();
			if(answer.equals(stringWeek[Num])){
				System.out.print("正解です。もう一度？1=Yes/0=No :");
				int check = stdIn.nextInt();
				if(check == 1){
					continue;
				}else if(check == 0){
					break;
				}else{
					continue;
				}
			}else{
				System.out.println("違います");
				continue;
			}

		}
	}

}
