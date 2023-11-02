package practice;

public class Arraysum {
	
	public static int arraysum(int arr[]) {
		
		int countsum = 0;
		
		for(int i=0;i<arr.length;i++) {
			countsum += arr[i];
		}
		return countsum;
		
	}

	public static void main(String[] args) {
		int arr[] = {1,2,4,8,16,32};
		
		int target = arraysum(arr);
		
		System.out.println("당신이 입력한 배열의 합은"+target+"입니다.");
	}

}
