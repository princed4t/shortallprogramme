package practiseallprogrammeinone;

public class Duplicateelementbyusingrealindex {

	public static void main(String[] args) {
		String str="sohamsoham";
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			int indexOf = str.indexOf(ch,i+1);
			if(indexOf==-1) {
				sb.append(ch);
			}
		}
       System.out.println(sb);
	}

}
