package Imp_Re;

public class Fibonacci_Series {

	public static void main(String[] args) {
		
		// 0 1 1 2 3 5 8
		
		int temp1=1;
		int temp2 =2;
		int fibo;
		
		System.out.print("0 1 ");
		
		for(int i = 0; i<=5; i++)
		{
			fibo = temp1+temp2;  // 1 +2 = 3
			
			temp1 = temp2; // temp1 =2
			temp2 = fibo; //temp = 3
			
			System.out.print(fibo+" ");
		}

	}

}
