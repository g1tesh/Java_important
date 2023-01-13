package Imp_Re;

import java.util.HashMap;
import java.util.Map;

public class String_Occurence_HashMap {

	public static void main(String[] args) {
		
		
		String str = "Hello world Hello Java";
		
		char arr[] = str.toCharArray();
		
		Map<Character, Integer> hm = new HashMap();
		
		for(char v : arr)
		{
			
			if(hm.containsKey(v) )
			{
				hm.put(v, hm.get(v)+1);
			}
			else
			{
				hm.put(v, 1);
			}
		}
		
		System.out.println(hm);
		

	}

}
