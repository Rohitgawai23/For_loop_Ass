//Q8. Write a program to find sum  and count of all odd numbers between 1 to n. by using for loop

import java.util.*;
class SumandCount1_to_n_Odd
{
	public static void main(String []args)
	{
		int n,oddSum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the any number= ");
		n=sc.nextInt();
		
		
		for(int i=1; i<=n; i++)
		{
			if(i%2==1)
			{
				oddSum=oddSum+i;
			}
		}		

		System.out.println("The sum of odd number upto ="+oddSum);
		
	}
}
