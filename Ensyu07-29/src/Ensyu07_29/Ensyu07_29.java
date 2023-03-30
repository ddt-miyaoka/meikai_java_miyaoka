package Ensyu07_29;

public class Ensyu07_29 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[][] a = {{1,2,3},{4,5,6}};
		int[][] b = arryClone2(a);
		
	}
	static int[][]arryClone2(int[][] a){
		int[][] c = new int[2][3];
		for(int i = 0; i < a.length; i++){
			for(int j = 0; j < a[i].length; j++){
				c[i][j] = a[i][j];
			}
		}
		return c;
	}

}
