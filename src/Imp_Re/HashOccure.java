package Imp_Re;

import java.util.HashMap;
import java.util.Map;

public class HashOccure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "i love india";
		String or =str.replaceAll(" ", "");
		
		char ch[] = or.toCharArray();
		
		Map<Character, Integer> hm = new HashMap<Character, Integer>();
		
		for(char c : ch)
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
		System.out.println(hm);
		

	}

}
