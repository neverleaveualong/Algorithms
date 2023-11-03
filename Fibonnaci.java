package practice;

public class Fibonnaci {
	
	public static int fibonnaci(int n) {
		
		if (n == 1) {
			return 1;
		}
		else if (n == 0)
			return 0;
		else {
			return fibonnaci(n-1) + fibonnaci(n-2);
		}
		
	}

	public static void main(String[] args) {
		
		int n = 10;
		
		int result = fibonnaci(n);
		
		System.out.println("피보나치 수열의"+n+"번째 항의 값은"+result+"입니다.");

	}

}
