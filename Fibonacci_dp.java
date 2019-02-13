import java.util.Arrays;


public class Fibonacci_dp {
	int max=100;
	int lookup[] = new int[max];
	int initial_val = -1;
	
	
	public static void main(String[] args) {
		
		Fibonacci_dp fib = new Fibonacci_dp();
		Arrays.fill(fib.lookup, fib.initial_val);
		System.out.println("Result: " +fib.fibonacci(20));
		
		for(int i : fib.lookup)
		{
			System.out.print(i +", ");
		}
	}
	
	private int fibonacci(int n)
	{
		if(lookup[n] == initial_val)
		{
			if(n<=1)
				lookup[n] = n;
			else
				lookup[n] = fibonacci(n-1)+fibonacci(n-2);
			return lookup[n];
		}
		else
		{
			return lookup[n];
		}		
	}

}