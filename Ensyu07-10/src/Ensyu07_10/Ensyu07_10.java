package Ensyu07_10;

import java.util.Random;
import java.util.Scanner;

public class Ensyu07_10 {
static Scanner stdIn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Random rand = new Random();
		System.out.println("暗算力トレーニング");
		do{
			int x = rand.nextInt(900) + 100;
			int y = rand.nextInt(900) + 100;
			int z = rand.nextInt(900) + 100;
			while(true){
				int q = rand.nextInt(4);
				if(q == 0){
					System.out.println(x + "+" + y + "+" +  z  + "= ");
					int k =stdIn.nextInt();
					if(k == x + y + z){
						break;
					}
					System.out.println("違いますよ！！");
				}else if(q ==1){
					System.out.println(x + "+" + y + "-" +  z  + "= ");
					int k = stdIn.nextInt();
					if(k == x + y - z){
						break;
					}
					System.out.println("違いますよ！！");
				}else if(q == 2){
					System.out.println(x + "-" + y + "+" +  z  + "= ");
					int k = stdIn.nextInt();
					if(k == x -  y + z){
						break;
					}
					System.out.println("違いますよ！！");
				}else if(q == 3){
					System.out.println(x + "-" + y + "-" +  z  + "= ");
					int k = stdIn.nextInt();
					if(k == x -  y  -  z){
						break;
					}
					System.out.println("違いますよ！！");
				}
				System.out.println("");
			}
		}while (comfirmRetry());
	}

	static boolean comfirmRetry(){
		int cont;
		do{
			System.out.print("もう一度？〈Yes・・・1/No・・・0〉：");
			cont = stdIn.nextInt();
		}while(cont != 0 && cont != 0);
		return cont ==1;
	}

}
