package practiseallprogrammeinone;

public class Numbertowordsinjava {
	public static void main(String[] args) {
		int n=2008;
		int ab=n;
		String[] a = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven",
				"twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };
       String[]b= {"","ten","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
	   String c= "hundred";
	   String d= "thousand";
	   int ones=n%10;
	   System.out.println(ones);// 4digit
	   n=n/10;
	   int tens=n%10;
	   System.out.println(tens);// 3digit
	   n=n/10;
	   int hundreds=n%10;
	   System.out.println(hundreds);// 2digit
	   n=n/10;
	    int thousands=n%10;
	    n=n/10;
	    System.out.println(thousands);// 1digit
       System.out.println(ab); 
	    
	    if(ab<20) {
	    	System.out.println(a[ab]);
	    }
	    else  if(ab<100) {
	    	System.out.println(b[tens]+a[ones]);
	    }
	    else if(ab<1000) {
	    	System.out.println(a[hundreds]+c+b[tens]+a[ones]);
	    }
	    else {
	    	if(tens!=0&&hundreds!=0) {
	    		System.out.println(a[thousands]+d+a[hundreds]+c+b[tens]+a[ones]);
	    	}
	    	else {
	    		System.out.println(a[thousands]+d+a[hundreds]+b[tens]+a[ones]);
	    	}
	    	
	    	
	    }
	
	}
	
	
	

}
