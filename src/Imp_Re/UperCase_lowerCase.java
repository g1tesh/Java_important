package Imp_Re;

public class UperCase_lowerCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str = "HelLo";
		String lower ="";
		String upper = "";
		int lowercount =0;
		int uppercount = 0;
		
		char ch[] = str.toCharArray();
		
		for(int i = 0; i<ch.length; i++)
		{
			if(ch[i]>65 && ch[i]<=90)
			{
				lower = lower+ch[i];
				lowercount++;
			}
			else
			{
				upper = upper+ch[i];
				uppercount++;
			}
		}
		System.out.println(upper+ " "+uppercount);
		System.out.println(lower+" "+lowercount);

	}

}
