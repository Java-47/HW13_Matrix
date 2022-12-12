package telran.matrix.tools;

public class Matrix {
	public static int sum(int[][] matrix) {
		int sum = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				sum += matrix[i][j];
			}
		}
		return sum;
	}

	public static int[][] transp(int[][] matrix) {
		int[][] matrix2 = new int[matrix[0].length][matrix.length];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {

				matrix2[j][i] = matrix[i][j];
			}
		}

		return matrix2;
	}

	public static int[][] multiply(int[][] matrix1, int[][] matrix2) {
		int matrix3[][] = new int[matrix1.length][matrix2[0].length];

		for (int i = 0; i < matrix1.length; i++) {
			for (int j = 0; j < matrix2[0].length; j++) {
				for (int k = 0; k < matrix2.length; k++) {

					matrix3[i][j] += matrix1[i][k] * matrix2[k][j];
				}
			}
		}
		return matrix3;
	}

}
