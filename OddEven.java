/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class OddEven
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sysin=new Scanner(System.in);
		int num=sysin.nextInt();
		if(num%2==0)
		System.out.println("Even");
		else
		System.out.println("Odd");
	}
}