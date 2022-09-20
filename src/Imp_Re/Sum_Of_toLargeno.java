package Imp_Re;

public class Sum_Of_toLargeno {

	public static void main(String[] args) {
		
		int arr[] = {10,30,55,4,50,34};
		
		int temp = 0;
		int sum = 0;
		int length = 0;
		int sortedArry[] = new int[10];
			for(int i = 0; i<arr.length; i++) {
				
				for(int j = i+1; j<arr.length; j++)
				{
					if(arr[i]>arr[j])
					{
						temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
				
				
			}
			sum= arr[arr.length-1]+arr[arr.length-2];
			System.out.println(sum);

	}

}
