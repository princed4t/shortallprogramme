package practiseallprogrammeinone;

public class Toreplacetwith1and2 {

	public static void main(String[] args) {
		String s = "abtttcdtt";
		String s1 = "";
		Integer count = 1;

		for (int i = 0; i < s.length(); i++) {
			char charAt = s.charAt(i);

			if (charAt == 't') {
				charAt = count.toString().charAt(0);
				count++;
				s1 = s1 + charAt;

			} else {
				s1 = s1 + charAt;

			}

		}

		System.out.println(s1);
	}

}
