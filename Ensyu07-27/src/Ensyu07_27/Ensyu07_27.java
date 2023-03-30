package Ensyu07_27;

public class Ensyu07_27 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//Scanner stdIn = new Scanner(System.in);
		int[][] a = {{1,2,3},{4,5,6}};
		int[][] b = {{6,5,4},{3,2,1}};
		int[][] c = new int[2][3];
		addMatrix(a,b,c);
		printMatrix(a);
		printMatrix(b);
		printMatrix(c);
		
	}
	static boolean addMatrix(int[][] x, int[][] y, int[][] z){
		if(x.length != y.length || x.length != z.length){
			return false;
		}
		for(int i = 0; i < x.length; i++){
			for(int j = 0; j < x[i].length; j++){
				z[i][j]= x[i][j]+y[i][j];
			}
		}
		return true;
	}
	
	static void printMatrix(int[][] m){
		for(int i = 0; i < m.length; i++){
			for(int j = 0; j< m[i].length; j++){
				System.out.print(m[i][j]);
			}
			System.out.println();
		}
	}
}
