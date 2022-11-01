package practiseallprogrammeinone;

public class Selectionsort {

	public static void main(String[] args) {
		int[] a = {5,3,1,55,32,7,4,2,2};
		int min = 0;
		for (int i = 0; i < a.length-1; i++) {
			min = i;
			for (int j = i + 1; j < a.length ; j++) {
				if (a[min]>a[j]) {
					min = j;
				}
			}
			int swap = a[i];
			a[i] = a[min];
			a[min] = swap;

		

		}
		for (int b : a) {
			System.out.println(b);
		}

	}

}
