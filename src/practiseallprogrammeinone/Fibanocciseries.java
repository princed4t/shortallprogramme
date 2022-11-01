package practiseallprogrammeinone;

public class Fibanocciseries {

	public static void main(String[] args) {
		int a=0;
		int b=1;
	     int n=10;
	     System.out.print(a +",");
	     System.out.print(b+",");
		for(int i=1;i<=n-2;i++) {
			int sum=a+b;
			System.out.print(sum +",");
			a=b;
			b=sum;
			
			
		}

	}

}
