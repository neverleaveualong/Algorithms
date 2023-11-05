package practice;

public class BinomialCoefficient {
	
	public static int bin(int n, int k) {
		int[][]B = new int[n+1][k+1];
		
		for(int i = 0; i<=n; i++) {
			for(int j=0; j<= Math.min(i, k); j++) {
				if (j==0 || j ==1) {
					B[i][j] = 1;
				}else {
					B[i][j] = B[i-1][j-1] + B[i-1][j];
				}
			}
		}
		
		return B[n][k];
	}

	public static void main(String[] args) {
		int n = 5;
		int k = 2;
		int result = bin(n, k);
		System.out.println("이항 계수 C(" + n + ", "+ k + ") =" + result);
		

	}

}
