package telran.matrix.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import telran.matrix.tools.Matrix;

class MatrixTest {

	int[][] matrix1 = { { 1, 2, 3 } };
	int[][] matrix2 = { { 1 }, { 2 }, { 3 } };

	@Test
	void testSum() {
		assertEquals(6, Matrix.sum(matrix1));
	}

	@Test
	void testTransp() {
		assertArrayEquals(matrix2, Matrix.transp(matrix1));

	}

	@Test
	void testMultiply() {
		int[][] expectedMul = { { 14 } };
		assertArrayEquals(expectedMul, Matrix.multiply(matrix1, matrix2));
		int[][] arr1 = { { 1, 2, 3 }, { 4, 5, 6 } };
		int[][] arr2 = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
		int[][] expected = { { 22, 28 }, { 49, 64 } };
		assertArrayEquals(expected, Matrix.multiply(arr1, arr2));
	}

	private void printMatrix(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
