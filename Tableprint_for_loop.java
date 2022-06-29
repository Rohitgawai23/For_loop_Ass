//. Wap print table of any no.


import java.util.*;
class Tableprint_for_loop
{
	public static void main(String[] args)
	{
     		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number for multiplication : ");
		int n = sc.nextInt();

		for(int i=1; i<=10;i++)
		
			System.out.printf("%d x %d= %d\n",n,i,n*i);
			
	}
}