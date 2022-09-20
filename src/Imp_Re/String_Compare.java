package Imp_Re;

public class String_Compare {

	public static void main(String[] args) {
		
		String s1 = "ABCDEFG";
		String s2 = "ABCDEFG";
		
		char ch1[] = s1.toCharArray();
		char ch2[] = s2.toCharArray();
		boolean flag = true;
		
		for(int i = 0; i<ch1.length; i++) //
		{
			for(int j = i; j<=i; j++) //
			{
				if(ch1[i] == ch2[j])
				{
					flag = false;
					
				}
				else
				{
					flag = true;
				}
				
			}
		}
		
		if(flag == false)
		{
			System.out.println("All characters are same");
		}
		else
		{
			System.out.println("All characters are not same");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		if(ch1[0] == ch2[0])
		{
			System.out.println("1st character is same");
		}
		else
		{
			System.out.println("1st char is not same");
			
			
		}

	}

}
