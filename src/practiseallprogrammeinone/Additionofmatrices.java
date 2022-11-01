package practiseallprogrammeinone;

public class Additionofmatrices {

	public static void main(String[] args) {
		int a[][] = { { 1, 2, 3 }, 
				{ 4, 5, 6 },
				{ 7, 8, 9 } };

		int b[][] = { { 1, 2, 3 },
				{ 4, 5, 6 },
				{ 7, 8, 9 } };

		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {

				sum = a[i][j] + b[i][j];
				System.out.print(sum + " ");

			}
			System.out.println();

		}

	}

}
