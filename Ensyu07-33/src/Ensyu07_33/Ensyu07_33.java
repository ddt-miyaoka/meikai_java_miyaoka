package Ensyu07_33;

public class Ensyu07_33 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] a = {1,2,5};
		int[][] b = {{51,100,200},{700,50,89}};
		printArray(a);
		printArray(b);
	}
	static void printArray(int[] a){
		for(int i = 0; i < a.length; i++){
			System.out.print(" " + a[i]);
		}
		System.out.println("");
	}
	
	static void printArray(int[][] a){
		for(int i = 0; i < a.length; i++){
			for(int j = 0; j < a[i].length; j++){
				System.out.print(" " + a[i][j]);
			}
			System.out.println("");
		}
	}
}
