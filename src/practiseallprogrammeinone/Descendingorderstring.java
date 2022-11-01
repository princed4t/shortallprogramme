package practiseallprogrammeinone;

public class Descendingorderstring {

	public static void main(String[] args) {
		String s = "abcdxyz";
		String s2="";
		char[] charArray = s.toCharArray();
		for(int i=0;i<charArray.length;i++) {
			for(int j=i+1;j<charArray.length;j++) {
				if(charArray[i]<charArray[j]) {
					char swap=charArray[i];
					charArray[i]=charArray[j];
					charArray[j]=swap;
					
					
					
				}
				
				
				
			}
		
			
			
			
			
			
		}
		
		for(char ch:charArray) {
		s2=ch+"";
		System.out.print(s2);
		}


	}

}
