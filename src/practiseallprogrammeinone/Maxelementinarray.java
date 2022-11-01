package practiseallprogrammeinone;

public class Maxelementinarray {

	public static void main(String[] args) {
		int[]a= {10,20,54,32,433,454,566};
		int max=a[0];
		
	   for(int i=1;i<a.length;i++) {
		   if(max<a[i]) {
			   max=a[i];
		   }
		   
		   
		   
	   }

	   System.out.println(max);
	   
	}

}
