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
		String ss=new String();
		ss=s.next();
		char c[]=ss.toCharArray();
		Set <String> se=new LinkedHashSet <String>();
		for(int i=0;i<ss.length();i++){
			se.add(String.valueOf(c[i]));
		}
		System.out.println(se);
	}
}
