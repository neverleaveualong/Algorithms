package practice;

public class Mergesort {

    public static void mergeSort(int n, int[] S) {
        int h = n/2;
        int m = n-h;
        
        int[] U = new int[h];
        int[] V = new int[m];
        
        System.arraycopy(S,0,U,0,h);
        System.arraycopy(S, h, V, 0, m);
    }

    public static void merge(int h, int m, int[] U, int[] V, int[] S) {
        int i = 0, j = 0, k = 0;

        while (i < h && j < m) {
            if (U[i] < V[j]) {
                S[k] = U[i];
                i++;
            } else {
                S[k] = V[j];
                j++;
            }
            k++;
        }

        while (i < h) {
            S[k] = U[i];
            i++;
            k++;
        }

        while (j < m) {
            S[k] = V[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {27, 10, 12, 20, 25, 13, 15 ,22};
        int arrLength = arr.length;

        System.out.println("정렬전 배열:");
        printArray(arr);

        mergeSort(arrLength, arr);

        System.out.println("\n정렬 후 배열:");
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}