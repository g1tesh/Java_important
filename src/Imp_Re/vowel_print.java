package Imp_Re;

public class vowel_print {

	public static void main(String[] args) {
		
		for(char i = 65; i<=90; i++)
		{
			if(i == 'A' || i=='E' || i == 'I' || i =='O' || i == 'U')
			{
				
				int vowel = i;
				System.out.println(i + " --ASCII value is "+vowel);
				
			}
		}

	}

}
