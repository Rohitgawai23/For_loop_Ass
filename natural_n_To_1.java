//Q4. Write a program to print all natural numbers in reverse (from n to 1). - using 
//    while loop

import java.util.*;
class natural_n_To_1
{
	public static void main(String []args)
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		n=sc.nextInt();
		
		for(int i=n; i>=1; i--)
		{
			System.out.print(i+" ");	
		}
		
	}
}