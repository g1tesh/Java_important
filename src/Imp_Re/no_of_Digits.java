package Imp_Re;

public class no_of_Digits {

	public static void main(String[] args) {


		int num = 23456;  
		int count=0;
		
		while(num!=0)
		{

			num = num/10; 
			count++;
		}
		System.out.println(count);

	}

}
