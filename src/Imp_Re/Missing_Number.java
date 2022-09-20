package Imp_Re;

public class Missing_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num[] = {1,2,3,4,5,6,7,9};
		
		int temp = num[0];
		
		for(int i = 0; i<num.length; i++)
		{
			if(num[i] ==  temp)
			{
				temp++;
			}
			else
			{
				System.out.print("Missing number is ");
				System.out.println(num[i]-1);
				break;
			}
		}
		
		
	}

}
