package practiseallprogrammeinone;

public class Duplicateelementarray {

	public static void main(String[] args) {
		int[] a = { 11, 12, 51, 51, 11, 33, 11 };
		int[] b = new int[10];

		for (int i = 0; i < a.length; i++) {
			int count = 0;
			for (int j = i + 1; j < a.length; j++) {

				if (a[i] == a[j]) {

					count = 1;
					b[i] = a[i];
					break;
				}

			}
			if (count == 1) {
				System.out.println(a[i]);

			}
			
			
		

		}

	}

}
