
public class Blatt2_3_main {

	public static void main(String[] args) {
		// Euklid in main aus Faulheit
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		
		int a_original = a;
		int b_original = b;
		
		int res = b;
		if(a != 0) {
			while(b != 0) {
				if(a>b) {
					a= a-b;
				}
				else {
					b = b-a;
				}
			}			
		res = a;
		}
		
		System.out.println("ggT(" + a_original + ", " + b_original + ") = " + res);
			
	}

}
