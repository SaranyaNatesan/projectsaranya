/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int sum=0;
		while(n!=0)
		{
			n=n%10;
			sum+=n;
			n=n/10;
		}
		String st=String.valueOf(sum);
		StringBuffer sb=new StringBuffer(st).reverse();
		int a=Integer.parseInt(sb.toString());
		if(sum==a)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
	}
}
