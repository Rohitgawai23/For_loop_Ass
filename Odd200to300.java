//Q10.Display all odd numbers from 200 to 300. 

import java.util.*;
class Odd200to300
{
	public static void main(String []args)
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");	
		n=sc.nextInt();
		
		
		for(int i=200; i<=n; i++)
		{
			if(i%2==1)
			System.out.print(i+" ");
		}
	}
}