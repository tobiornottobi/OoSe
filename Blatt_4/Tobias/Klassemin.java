
public class Klassemin {

	//public static Comparable findMin (Comparable[] arr)
	public static <T extends Comparable<T>> T findMin (T[] arr)
	{
		
		int min=0;
/*
		T  minimum = null;
		for(T t : arr) {
			if (t==null)
			{
				continue;
			}
			else if(minimum==null || 0 < minimum.compareTo(t))
			{
				minimum=t;
			}
		}
		*/
		//oder
		
		for(int i=0; i<arr.length;i++){
			if ( arr[i]!=null && (arr[min]==null || 0 < arr[min].compareTo(arr[i])) ){
				min=i;
			}
		}
		return arr[min];
	}
	
}
