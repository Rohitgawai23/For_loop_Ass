// palindrome program using for loop 

import java.util.*;
class palindrome_forloop
{	
	public static void main(String []args)
	{
	int n,rev=0,rm;  //  variable declaration
	Scanner sc=new Scanner(System.in);    // scanner class object
	System.out.print("Enter the number= ");
	n=sc.nextInt();                        // using scanner object taking input by user
	int i=n;
	
	for( ;i!=0; i=i/10)
	{
	
		rm=i%10;       // finding reminder we use
		rev=rev*10+rm;   // finding reverse formula
		             

	}
	 if(n==rev)
		System.out.println("It is palindrome number");
	else
		System.out.println("It is not palindrome number ");
			

	}
} 