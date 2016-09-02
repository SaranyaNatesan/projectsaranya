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
		int sum=0,a=0,b=0;
		while(n!=0)
		{
			b=a;
			a=n%10;
			sum+=Math.pow(a,b);
			n=n/10;
		}
		System.out.println(sum);
	}
}
