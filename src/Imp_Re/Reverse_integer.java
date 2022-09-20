package Imp_Re;

public class Reverse_integer {

	public static void main(String[] args) {
		
		 int number = 345678;
		 int temp;
		 int rev = 0;
		 
		 while(number!=0)
		 {
			 temp = number%10;
			 rev = rev*10+temp;
			 number =number /10;
			 
		 }
		 System.out.println(rev);
		 
	}

}
