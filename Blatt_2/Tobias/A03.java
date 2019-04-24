
public class A03 {

	public static void main(String[] args) {
		System.out.println(Euklid(120, 50));

	}
	public static long Euklid(long a, long b)
	{
		long erg=0;
		if (a==0)
		{
			return erg=b;
		}
		else
		{
		while (b!=0)
		{
			if(a>b)  
			{
				a=a-b;
			} 
			else
			{
				b=b-a; 
			}
			erg=a;
		}
		}
		return erg;
	}

}
