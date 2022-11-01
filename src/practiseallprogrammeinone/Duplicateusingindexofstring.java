package practiseallprogrammeinone;

public class Duplicateusingindexofstring {

	public static void main(String[] args) {
		String s = "harmoneharmone";
		for (int i = 0; i < s.length(); i++) {
			boolean falg = false;

			for (int j = i + 1; j < s.length(); j++) {

				if (s.charAt(i) == s.charAt(j)) {
					falg = true;
					break;

				}

			}
			if(falg) {
				System.out.print(s.charAt(i));
			}

		}

	}

}
