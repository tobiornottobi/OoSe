
public class A01 {

	public static void main(String[] args) 
	{

		System.out.println(fakult(4));
		System.out.println(binkoef(64, 6));
		System.out.println(lotto(64, 6));
	}
	public static long fakult(long in)
	{
		if(in==0)
		{
			return 1;
		}
		long out=in*fakult(in - 1);
		return out;
	}
	
	public static long binkoef(long n, long k)
	{
		//try – nicht negativ
		long out=0;
		
		if (0<=n&&n<k)
		{
			return 0;
		}
		else if (0<=k&&k<=n)
		{
			return (fakult(n)/( (fakult(k)*fakult(n-k)) ));
		}
		else
		{
			System.out.println("Nicht für eingabe definiert");
		}
		
		return out;
	}

	public static long lotto(long n, long k)
	{
		long out=binkoef(n, k)*fakult(k);
		
		System.out.println("Ungenauigkeiten durch Division im Binomialkoeffizienten, auch durch Multiplikation mit k! verschärft");
		return out;
	}

}
