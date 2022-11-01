package practiseallprogrammeinone;

public class SumoftwoArray {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6};
		int[] b = { 1, 2, 3, 4, 5, 67 };
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				//System.out.println(b.length);
				sum = a[i] + b[i];
				System.out.print(sum);
				break;
				
			}
		
		}
	

	}

}
