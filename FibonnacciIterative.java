package practice;

public class FibonnacciIterative {
	
	public static int fibonnacciiterative(int n) {
		
		int[] fibo = new int[n];
		fibo[0] = 0;
		
		if (n > 1) {
			fibo[1] = 1;
			for(int i = 2; i < n; i++) {
				fibo[i] = fibo[i-2] + fibo[i-1];
			}
		}
		
		return fibo[n-1];
	}

	public static void main(String[] args) {
		
		int n = 1;
		int result = fibonnacciiterative(n);
		System.out.println("피보나치 수열의"+n+"번째 항의 값은"+result+"입니다.");

	}

}
