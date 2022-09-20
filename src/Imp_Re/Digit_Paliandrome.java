package Imp_Re;

public class Digit_Paliandrome {

	public static void main(String[] args) {
		
		int num = 1221;
		int original = 1221;
		int temp;
		int rev = 0;
		
		while(num!=0)
		{
			temp = num%10; 
			rev = rev*10+temp;
			num= num/10; 
		}
		System.out.println("reverse number is  "+rev);
		
		if(original == rev)
		{
			System.out.println("Given number is a paliandrome");
		}
		else
		{
			System.out.println("Given number is not a paliandrome");
		}
	}

}
