package practice;

public class MatrixMulti {

    public static int[][] matrixMultiplication(int[][] matrixA, int[][] matrixB) {
        int aRows = matrixA.length;
        int aColumns = matrixA[0].length;
        int bColumns = matrixB[0].length;

        if (matrixB.length != aColumns) {
            throw new IllegalArgumentException("행렬의 크기가 맞지 않습니다.");
        }

        int[][] result = new int[aRows][bColumns];

        for (int i = 0; i < aRows; i++) {
            for (int j = 0; j < bColumns; j++) {
                for (int k = 0; k < aColumns; k++) {
                    result[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] matrixA = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int[][] matrixB = {
            {7, 8},
            {9, 10},
            {11, 12}
        };

        int[][] result = matrixMultiplication(matrixA, matrixB);

        // 결과 출력
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}