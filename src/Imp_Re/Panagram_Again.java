package Imp_Re;

public class Panagram_Again {

	public static void main(String[] args) {
		
		
		 String str = "The quick brown fox jumps over the lazy dog";
		 boolean [] arr = new boolean[26];
		 int index = 0;
		 int flag = 1;
		 
		 str = str.toLowerCase();
		 
		 for(int i = 0; i<str.length(); i++ )
		 {
			 if(str.charAt(i)>='a' && str.charAt(i)<='z')
			 {
				 index = str.charAt(i)- 'a';
				 
			 }
			 arr[index] = true;
		 }
		 
		 for(int i = 0; i<=25; i++)
		 {
			 if(arr[i]==false)
			 {
				 flag = 0;
			 }
		 }
		 
		 if(flag == 1)
		 {
			 System.out.println("panagram");
		 }
		 else
		 {
			 System.out.println("not");
		 }
		 

	}

}
