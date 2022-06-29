//Q18.Wap to find factorial of a no.by using for loop

import java.util.Scanner;
class factorial_for 
{
	public static void main(String []args)
	{
	  int fact=1;
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the number");
	  int n=sc.nextInt();
	  
	  for(int i=1;i<=n; i++)
		{
		fact=fact*i;
		}
	    System.out.println("factorial of " +n+ " is= "+fact);
		
	}
}
