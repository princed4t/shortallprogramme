package practiseallprogrammeinone;

public class Replacewithi {

	public static void main(String[] args) {
		String s = "applitying";
		String s1="";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if(ch=='i') {
				ch='o';
				s1=s1+ch;
			}
			else {
				s1=s1+ch;
			}
		}

		System.out.println(s1);
		
		
	}

}
