// Q3. Write a program to print all natural numbers from 1 to n. - using for loop

import java.util.*;
class natural_1_To_n
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