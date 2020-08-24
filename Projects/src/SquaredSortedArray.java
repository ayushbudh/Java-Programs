// You have a sorted array of integers. Write a function that returns a sorted array containing the squares of those integers.

import java.util.Arrays;

public class SquaredSortedArray {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		int array[] = {-7,-3,-1,4,8,12};
		int b[] = {-7,-3,-1,4,8,12};
		SquaresortedArray(array);
		System.out.println(Arrays.toString(array));
		
		System.out.println(Arrays.toString(SquareSortedArray2(b)));
		
	}
	
	public static int[] SquaresortedArray(int a[])
	{
		for(int i=0; i<a.length; i++)
		{
			a[i] = a[i]*a[i];
		}
		Arrays.sort(a);
		return a;
	}
	
	// Method with faster time complexity
	public static int[] SquareSortedArray2(int c[])
	{
		int squarearray[]= new int[c.length];
		
		for(int i=0; i<squarearray.length; i++)
		{
			if(Math.abs(c[i])>Math.abs(c[c.length-1-i]))
			{
				squarearray[c.length-1-i]=c[i]*c[i];
			}
			else
			{
				squarearray[c.length-1-i]=c[c.length-1-i]*c[c.length-1-i];
			}
		}
		return squarearray;
	}

}
