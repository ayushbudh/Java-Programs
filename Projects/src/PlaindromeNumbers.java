// Write a program to see whether the given number is PlainDrome or not 

import java.util.Arrays;
import java.util.Scanner;

public class PlaindromeNumbers 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n=sc.nextInt();
		sc.close();
		
		int count=0;
		int number=n;
		while(number!=0)
		{
			number=number/10;
			count++;
			
		}
		int a[] = new int[count];
		int originalArray[] = new int[count];
		int r;
		for(int i=0; i<a.length; i++)
		{
			r=n%10;
			n=n/10;
			a[i]=r;
			originalArray[i]=r;
			
		}
		reverse(a);
		System.out.println("Is the number palindrome ? "+Arrays.equals(originalArray, a));  // Arrays.equals() method used to see if the elements in both arrays are of same in number
																							// and that the elements are the same 
	}

	public static int[] reverse(int b[])
	{
		int temp;
		for(int i=0; i<(b.length/2); i++)
		{
			temp=b[i];
			b[i]=b[b.length-1-i];
			b[b.length-1-i]=temp;				
		}
		return b;
	}	
}
