package Imp_Re;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Inter the number you want factorial for : ");
		int num = sc.nextInt();
		
		for(int i = num-1; i>1; i--)
		{
			num = num*i;     
			
		}
		System.out.println(num);
		

	}

}
