package Imp_Re;

public class Array_Sort {

	public static void main(String[] args) {

		int array[] = {50,30,55,90,44,60,33,22,11,66};
		int temp = 0;
		
		for(int i = 0; i<array.length;i++)
		{
			for(int j = i+1; j<array.length; j++)
			{
				if(array[i]>array[j])
				{
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
			
			System.out.print(array[i]+" ");
			
		}
		

		

	}

}
