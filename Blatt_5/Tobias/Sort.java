
public class Sort {
	public static double[] sortier(double[] arr)
	{
		double[] out= new double[arr.length];
		for(int k=0, min=0; k<arr.length; k++)
		{
			for (int i=0; i<arr.length; i++)
			{
				if (arr[i]<arr[min]){
					min=i;
				}
				
			}
			out[k]=arr[min];
			arr[min]=Double.MAX_VALUE;
			System.out.println(out[k]);
		}
		return out;
/*
  		for (double s: arr)
 
		{
			if(! ((Double) s == null))
			{
				
			}
		}
*/			
	}
}
