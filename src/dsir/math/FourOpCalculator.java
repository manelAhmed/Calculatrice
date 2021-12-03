package dsir.math;

public class FourOpCalculator {
	public int add(int a, int b)
	{
		return a + b;
	}

	public int sub(int a, int b)
	{
	return a - b;
	}

	public int mul(int a, int b)
	{
	return a * b;
	}

	public Double div(int a, int b)
	{
		if(b==0)
			throw new ArithmeticException("Argument 'divisor' is 0");
		else
			return (double)a / b;
//		try {
//			return (double) (a / b);
//		} catch (ArithmeticException ae) {
//	        
//	        return  null;
//	    }
		
	}

}
