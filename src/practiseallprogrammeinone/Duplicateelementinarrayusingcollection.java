package practiseallprogrammeinone;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Duplicateelementinarrayusingcollection {

	public static void main(String[] args) {
		int[] a = { 10, 20, 30, 40, 22, 10, 30, 10 };
		Map<Integer, Integer> map = new LinkedHashMap<>();
		for (int i = 0; i < a.length; i++) {
			if (!map.containsKey(a[i])) {

				map.put(a[i], 1);
			} else {
			Integer in = map.get(a[i]);
				map.put(a[i],in+1);
			}

		}
	//	System.out.println(map);
		  Set<Integer> keySet = map.keySet();
		    for(Integer i:keySet) {
		    	    if(map.get(i)>=2) {
		    	    	  System.out.println(i);
		    	    }
		    	
		    	
		    }
		  
		
		
		

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
