package Imp_Re;

import java.util.Arrays;

public class AnaGram {

	public static void main(String[] args) {
		
		String str = "race";
		String str1 = "arec";
		
		char ch[] = str.toCharArray();
		char ch1[] = str1.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch);
		
		if(Arrays.equals(ch1, ch))
		{
			System.out.println("It is a Anagram");
		}
		else
		{
			System.out.println("It is not a  Anagram");
		}

	}

}
