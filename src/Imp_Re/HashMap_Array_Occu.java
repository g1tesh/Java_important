package Imp_Re;

import java.util.HashMap;
import java.util.Map;

public class HashMap_Array_Occu {

	public static void main(String[] args) {

		int arr[] = {10,20,4,5,10,20,5,66};
		
		Map<Integer,Integer> hm= new HashMap();
		
		for(int i : arr)
		{
			if(hm.containsKey(i))
			{
				hm.put(i, hm.get(i)+1);
			}
			else
			{
				hm.put(i, 1);
			}
			
		}
		
		
		

	}

}
