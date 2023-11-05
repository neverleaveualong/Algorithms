package practice;

public class QuickSort {
	
	
	public void quicksort(int left, int right, int[] arr) {
					
		if (left < right) {
			int pivotpoint = partition(left, right, arr);
			quicksort(left,pivotpoint-1,arr);
			quicksort(pivotpoint+1,right,arr);		
			}
	}
	
	public int partition(int left, int right, int[] arr) {
		int pivotpoint = arr[left];
		int j = left;
		
		for(int i = left + 1; i <= right; i++) {
			if (arr[i] < pivotpoint) {
				j++;
				exchange(arr, i, j);
			}
		}
		
		pivotpoint = j;
		exchange(arr, left, pivotpoint);
		return pivotpoint;
		
	}

	public void exchange(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	
	public static void main(String[] args) {
		int[] arr = { 5, 2, 9, 1, 5, 6 };
		
		System.out.println("정렬전 배열의 값:");
	    for (int num : arr) {
	        System.out.print(num + " "); 
	    }
		
		QuickSort sorter = new QuickSort();
		sorter.quicksort(0, arr.length - 1, arr);

	    System.out.print("\n정렬된 배열의 값:\n");
	    for (int num : arr) {
	        System.out.print(num + " ");
	    }
	}

}
