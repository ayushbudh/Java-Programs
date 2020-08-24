
public class FibonacciSeries2 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
	System.out.println(fib(6));
	}

	public static int fib(int n)
	{
	
	    if(n==1)
	    {
	    	return 0;
	    }
	    else if(n==2)
	    {
	    	return 1;
	    }
	    else
	    {
	    	return fib(n-2)+fib(n-1);
	    }
	}
}
