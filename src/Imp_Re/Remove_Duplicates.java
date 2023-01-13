package Imp_Re;

public class Remove_Duplicates {

	public static void main(String[] args) {
		
		
		String str =  "Gitesh Patil";
		
		char ch[] = str.toCharArray();
		
		for(int i = 0; i<ch.length; i++)
		{
			for(int j= i+1; j<ch.length; j++)
			{
				if(ch[i]==ch[j])
				{
					ch[i] =' ';
					ch[j] =' ';
				}
			}
			if(ch[i]!=' ')
			System.out.print(ch[i]+" ");
		}

	}

}
