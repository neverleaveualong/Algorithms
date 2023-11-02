package practice;

public class ExchangeSort {

    public static void exchangesort(int arr[]) {
        int n = arr.length;
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {3, 4, 12, 5, 18, 1, 14, 12};

        System.out.println("배열의 정렬 전 값은:");
        for (int value : arr) {
            System.out.print(value + " ");
        }

        exchangesort(arr);

        System.out.println("\n배열의 정렬 후 값은:");
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}