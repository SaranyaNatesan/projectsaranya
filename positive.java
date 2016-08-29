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
		int a=s.nextInt();
		if(a>0)
		{
			System.out.println("positive number");
		}
		else if(a<0)
		{
			System.out.println("negative number");
		}
		else
		{
			System.out.println("it is zero");
		}
	}
}
