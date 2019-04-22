//zum laden der args[] in main in Eclipse: "Run/Run Configurations"

public class Blatt2_1_main {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int k = Integer.parseInt(args[1]);
		Binomial b = new Binomial();
		
		b.n_fak = b.fak(n);
		System.out.println("a) " + args[0] + "! = " + b.n_fak);
		
		b.n_k = b.bin_coeff(n, k);
		System.out.println("b) (" + args[0] + " über " + args[1] + ") = " + b.n_k);
		
		long k_fak = b.fak(k);
		b.lotto = b.n_k * k_fak;
		System.out.println("c) (" + args[0] + " über " + args[1] + ") * " + args[1] + "! = " + b.lotto);
	}

}
