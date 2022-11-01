package practiseallprogrammeinone;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Stableandunstableinjava {
	public static void main(String[] args) {
		int[] a = { 3636, 101, 1414, 456, 788 };
		int sum = 0;
		int sum2 = 0;
		int finalsum = 0;
		Map<Integer, Integer> map = new LinkedHashMap<>();
		Map<Integer, Integer> map1 = new LinkedHashMap<>();
		Map<Integer, Integer> map2 = new LinkedHashMap<>();
		System.out.println("apple");
		for (int i = 0; i < a.length; i++) {
			int k = a[i];
			int orig = a[i];
			while (k != 0) {
				int r = k % 10;
				if (!map.containsKey(r)) {
					map.put(r, 1);
					k = k / 10;
				} else {
					Integer in = map.get(r);
					map.put(r, in + 1);
					k = k / 10;
				}

			}

			Set<Integer> keySet = map.keySet();
			int j = 0;
			for (Integer p : keySet) {
				j = map.get(p);
				break;
			}
			boolean flag = true;
			for (Integer p1 : keySet) {
				if (map.get(p1) != j) {
					flag = false;
					break;
				}
			}
			if (flag == true) {
				// System.out.println(orig + "is a stable number");
				map1.put(orig, 1);

			} else {
				// System.out.println(orig + "is not a stable number");
				map2.put(orig, 1);
			}
			map.clear();

		}
		System.out.println(map1.keySet().toString() + "isstable");
		System.out.println(map2.keySet().toString() + "isunstable");
		Set<Integer> keySet = map1.keySet();
		for (int l : keySet) {
			sum = sum + l;
		}
		Set<Integer> keySet2 = map2.keySet();
		for (int l : keySet2) {
			sum2 = sum2 + l;
		}

		System.out.println(sum + "ofstablenumber");
		System.out.println(sum2 + "ofnonstablenumber");
		finalsum = sum - sum2;
		// System.out.println(finalsum);
		System.out.println(Math.abs(finalsum));

	}

}
