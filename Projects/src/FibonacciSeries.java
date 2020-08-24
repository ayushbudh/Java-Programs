import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int max_num=sc.nextInt();
		int sum=0;
		for(int i=0; i<=sum; i++)
		{
			if(sum<max_num)
			{
				
			System.out.print(fib(i)+",");
			sum=fib(i+2);
			
			
			}
			else
			{
				System.out.print(fib(i));
				break;
			}
		}

	}
	
	public static int fib(int n)
	{
		if(n==0)
		{
			return 0;
		}
		else if(n==1 || n==2)
		{
			return 1;
		}
		else
		{
			return fib(n-2)+fib(n-1);
		}
		
		
	}

}
