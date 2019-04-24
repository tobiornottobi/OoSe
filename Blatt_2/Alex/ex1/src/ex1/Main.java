package ex1;

public class Main {
	public static long faculty (long n) {
		if(n<0) {
			System.out.println("Ungueltige Eingabe in Fakultaetsfunktion!");
			return 0;
		}
		if(n==0 || n==1) return 1;
		else return faculty(n-1)*n;
	}
	
	public static long binco (long n, long k) {
		if(n<0 || k<0) {
			System.out.println("Binomialkoeffizient ist nicht f�r negative Zahlen definiert!");
			return -1;
		}
		else if (0 <= n && n <= k) return 0;
		else return (faculty(n)/(faculty(k)*faculty(n-k)));
	}
	
	public static long lotto (long n, long k) {
		return binco(n,k)*faculty(k);
	}
	
	public static void main(String[] args) {
		long a,b;
		a=5;
		b=3;
		System.out.println("Fakultaet von " + a + " = " + faculty(a));
		System.out.println("Binomialkoeffizient: " + a + " ueber " + b + " = " + binco(a,b));
		System.out.println("modifiertes Lottoproblem mit n= " + a + " und k = " + b + "->  = " + lotto(a,b));

	}

}
