package practiseallprogrammeinone;

public class Firstandlastoccurrence {

	public static void main(String[] args) {
		String s = "appsuuusaosrest";
		System.out.println(s.length());
		int firstindex = -1;
		int lastindex = -1;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == 's') {
				if (firstindex == -1) {
					firstindex = i;

				} else {
					lastindex = i;

				}

			}

		}
		System.out.println(firstindex);
		System.out.println(lastindex);

	}

}
