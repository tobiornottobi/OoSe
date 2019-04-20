public class Nr1 {
	public static void main(String[] args) {
		System.out.println(facRec(5));
		System.out.println(binom(5, 2));
		System.out.println(naivC(10, 4));
	}

	public static long facRec(long n) {
		return (n == 1)? 1 : n * facRec(n - 1);
	}

	public static long binom(long n, long k) {
		long o = 1;
		for (int i = 0; i < k; i++) {
			o *= n - i;
		}
		return o / facRec(k);
	}

	public static long naivC(long n, long k) {
		return binom(n, k) * facRec(k);
	}
}