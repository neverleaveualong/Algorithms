package practice;

public class Seqsearch {
	
	public static int Sequencesearch(int arr[], int target) {
		
		for (int i=0; i < arr.length; i++) {
			if ( arr[i] == target ) {
				return i + 1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8};
		int target = 5;
		int result = Sequencesearch(arr, target);
		
		if (result != -1) {
			System.out.println("값"+target+"은 인덱스"+result +"에 있습니다");
		}
		else {
			System.out.println("값을 찾을 수 없습니다.");
		}	
	}
}
