//Q8. Write a program to find sum  and count of all Even numbers between 1 to n.using for loop 

import java.util.*;
class SumandCount1_to_n_Even
{
	public static void main(String []args)
	{
		int n,evenSum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the any number= ");
		n=sc.nextInt();
		
		
		for(int i=1; i<=n; i++)
		{
			if(i%2==0)
			{
				evenSum=evenSum+i;
			}
		}		

		System.out.println("The sum of even number upto ="+evenSum);
		
	}
}
