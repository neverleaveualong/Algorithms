package practice;

public class BinarySearch {
	
	
	public static int binarysearch(int[] arr, int x){
		
		int low = 0;
		int high = arr.length-1;
		int location = -1;
		
		while (low <= high) {
			int middle = (low + high) / 2;
			
			if (arr[middle] == x) {
				location = middle;
				break;
			}
			else if (arr[middle] > x) {
				high = middle - 1;
			}
			else  {
				low = middle + 1;
			}
		}
		
		return location;
		
	}

	public static void main(String[] args) {
		
		int arr[] = {1,3,5,7,9,11,13,20,30,40};
		int findvalue = 30;
		
		int resultvalue = binarysearch(arr, findvalue);
		
		if (resultvalue == -1) {
			System.out.println("찾고자하는 값 "+findvalue+"는 배열에 존재하지 않는 값입니다.");
		}
		else {
			System.out.println("찾고자하는 값 "+findvalue +"는 배열의"+(resultvalue+1)+"번째 위치해 있습니다.");
		}
	}
}