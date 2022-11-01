package practiseallprogrammeinone;

public class Multiplactionofmatrices {

	public static void main(String[] args) {

		int[][] firstmatrix = { { 1, 2, 3 },
				               { 2, 3, 4 } };
		int[][] secondmatrix = { { 1, 2 }, 
				                 { 4, 5 },
				                 { 7, 8 } };

		int[][] rmax = new int[2][2];
		int sum = 0;

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				for (int k = 0; k < 3; k++) {
					sum = sum + firstmatrix[i][k] * secondmatrix[k][j];

				}
				rmax[i][j] = sum;
				sum = 0;

			}

		}
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(rmax[i][j]+"  ");

			}
			System.out.println();
		}

	}

}
