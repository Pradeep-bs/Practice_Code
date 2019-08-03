package org.CodingChallengeByPradeep;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class ArrangeStrings {
	
	public static void sorting(String[] s) {
		Integer temp;
		TreeMap<String,Integer> tm=new TreeMap<String,Integer>();
		for (int i=0; i<s.length ; i++) {
			if(!tm.containsKey(s[i])) {
				tm.put(s[i],1);
			}
			else {
				temp=tm.get(s[i]);
				tm.put(s[i],temp+1);
			}
		}
		
//		Map.Entry m=tm.entrySet();
//		for(Map.Entry me : m) 
//            System.out.println(me.getKey()+":"+me.getValue()); 
//		
		for(Map.Entry<String, Integer> entry:tm.entrySet()) {
			System.out.println(entry.getKey()+":"+entry.getValue()); 
		}
		
		
	}

	public static void main(String[] args) {
	
		String[] s= {"b","c","a","b","dw" };
		sorting(s);

	}

}
