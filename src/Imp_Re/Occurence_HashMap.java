package Imp_Re;

import java.util.HashMap;
import java.util.Map;

public class Occurence_HashMap {

	public static void main(String[] args) {
		
		String str = "Hello Java Hello World";
		
		char ch[] = str.toCharArray();
		
		Map<Character, Integer> hm = new HashMap();
		
		for(char c: ch)
		{
			if(hm.containsKey(c))
			{
				hm.put(c, hm.get(c)+1);
			}
			else
			{
				hm.put(c, 1);
			}
		}
		
		for(Map.Entry<Character, Integer> mp: hm.entrySet())
		{
			if(mp.getKey()!=' ')
			{
				System.out.println(mp.getKey()+" : "+mp.getValue());
			}
		}
		
	}

}
