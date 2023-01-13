package Imp_Re;

public class Digit_Paliandrome {

	public static void main(String[] args) {
		
		int num = 1221;
		int original = num;
		int temp;
		int rev = 0;
		
		while(num!=0)
		{
			temp = num%10;  //1   2
			rev = rev*10+temp;  //0+1 12
			num= num/10;  //122
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
