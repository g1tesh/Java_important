package Imp_Re;

public class String_Rev_Capital {

	public static void main(String[] args) {
		
		String str = "hello java hello world";
		
		String S1 = "";
		
		String S2[] = str.split(" ");
		
		System.out.println(S2.length);
		
		
			
		for(int j= 0; j<S2.length; j++)
		{
			for(int i = S2[j].length()-1; i>=0; i--)
			{
				S1+=S2[j].charAt(i);
				
				
				//System.out.print(S1+S2[j].charAt(i));
			}
			
			
//			char capital = S2[j].charAt(S2[j].length()-1);
//			String first = Character.toString(capital);
//			first = first.toUpperCase();
//			char cap = first.charAt(0);
//			//System.out.println(cap);
//			//S1 = S1.replace(capital, cap);
			
			
			
			
			
			//System.out.println("Char "+str1.toLowerCase());
			
			S1+=" ";
			
		}
		
		 
		
		
		System.out.println(S1);
		
		
		
	}

}
