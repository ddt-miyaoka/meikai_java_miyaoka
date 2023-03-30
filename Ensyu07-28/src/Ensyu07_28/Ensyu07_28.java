package Ensyu07_28;

public class Ensyu07_28 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[][] a = {{1,2,3},{4,5,6}};
		int[][] b = {{7,8,9},{10,11,12}};
		addMatrix(a,b);
		
	}
	
	static int[][] addMatrix(int[][] x, int[][] y){
		int[][] z = new int[x.length][x.length];
		if(x.length != y.length){
			return z;
		}else{
			for(int i = 0; i < x.length; i++){
				for(int j = 0; j <x[i].length; j++){
					z[i][j] = x[i][j] + y[i][j];
				}
			}
			return z;
		}
	}
}
