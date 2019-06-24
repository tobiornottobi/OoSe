
public class A1 {
	public static boolean istPrimzahl(int x){
		boolean prim=true;
		for(int i=2;i<=x/2;i++) {
			if (x%i==0) {
				prim=false;
			}
		}
		
		return prim;
	}
	
	public static int[] primzahlenZwischen(int anfang, int ende){
		int[] arr=new int[ende-anfang];
		for(int i=0, cursor=0; i<=(ende-anfang); i++) {
			if (A1.istPrimzahl(anfang+i)==true) {
				arr[cursor]=anfang+i;
				cursor++;
			}
		}
		
		return arr;
	}
	
/*	
	public static void main(String[] args) {

	}
*/
}
