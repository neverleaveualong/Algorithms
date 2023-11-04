package practice;

public class BinarySearchRecursive {
	
	public static int binarysearch(int array[],int left, int right, int target){
		
		if(left > right) {
			return -1;
		}
		
		int mid = (left + right)/2;
		
		if (target == array[mid]) {
			return mid;
		}
		
		else if (target < array[mid]) {
			return binarysearch(array, left, mid -1 , target);
		}
		
		else {
			return binarysearch(array, mid+1, right, target );
		}
		
		
		
		
		
	}

	public static void main(String[] args) {
		int[] array = {10,12,13,14,18,20,25,27,30,35,40,45,47};
		int target = 18;
		int left = 0;
		int right = array.length-1;
		
		int index = binarysearch(array, left, right , target);
		
		if (index == -1){
			System.out.println(target+"값이 배열에 존재하지 않습니다");
		}
		else {
			System.out.println(target+"값은 배열의"+(index+1)+"번째 위치해 있습니다.");
		}
	}

}
