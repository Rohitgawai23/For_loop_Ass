// Write a program to print all odd number between 1 to 100. by using for loop 

import java.util.*;
class Odd_1To100
{
	public static void main(String []args)
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		n=sc.nextInt();
		
		for(int i=1; i<=n; i++)
		{
			if(i%2==1)
			System.out.print(i+" ");	
		}
		
	}
}