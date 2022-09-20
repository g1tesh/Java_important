package Imp_Re;

public class Paliandrome {

	public static void main(String[] args) {
		
		String str = "ramar";
		String rev = "";
		
		for(int i = str.length()-1; i>=0; i--)
		{
			rev+=str.charAt(i);
			
		}
		System.out.println(rev);
		
		if(str.equals(rev))
		{
			System.out.println("Given string is paliandrome");
		}
		else
		{
			System.out.println("Given string is not a paliandrome");
		}
		
	}

}
