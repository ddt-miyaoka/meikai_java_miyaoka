package Ensyu07_30;

public class Ensyu07_30 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] a = {2,1,3};
		min(1,2);
		min(3,1,2);
		min(a);
	}

	static int min(int a, int b){
		if(a > b){
			return b;
		}else{
			return a;
		}
	}

	static int min(int a, int b, int c){
		int min = a;
		if(min > b){
			min = b;
		}
		if(min > c){
			min = c;
		}
		return min;
	}

	static int min(int[] a){
		int min = a[0];
		for(int i = 0; i < a.length; i++){
			if(min < a[i]){
				min = a[i];
			}
		}
		return min;
	}
}
