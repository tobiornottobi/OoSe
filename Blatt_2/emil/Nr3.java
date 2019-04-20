public class Nr3 {

	public static void main(String[] args) {
		System.out.println(euklid(12, 450));
	}	

	public static int euklid(int a, int b) {
		if (a == 0) return 0;
		while (b != 0) {
			if (a > b) a = a - b;
			else b = b - a;
		}
		return a;
	}
}