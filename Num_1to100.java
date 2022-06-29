// Q1.Display numbers from 1 to 100. by using (for loop )

import java.util.*;
class Num_1to100
{
	public static void main(String []args)
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");	
		n=sc.nextInt();
		
		
		for(int i=1; i<=n; i++)
		{
			System.out.print(i+" ");
		}
	}
}
