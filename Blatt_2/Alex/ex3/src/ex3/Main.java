package ex3;

public class Main {
	public static long ggt (long a, long b) {
		if(a==0) return b;
		else {
			while(b!=0) {
				if (a>b) a-=b;
				else b-=a;
			}
			return a;
		}
	}
	
	public static void main (String args[]) {
		long a=148;
		long b=32;
		System.out.println("GGT(" + a + "," + b + ") = " + ggt(a,b));
	}
}
