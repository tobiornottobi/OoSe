
class Binomial{
	long n_fak;
	long n_k;
	long lotto;
	long fak(int n) {
		long res = 1;
		if(n == 0){res = 0;}
		for(int i = 1; i <= n ;i++) {
			res *= i;
		}
		return res;
	}
	
//Anmerkung zum Hinweis zur Aufgabe: wenn der Binomialkoeffizient noch schlechter implemetiert wird (alle Multiplikationen, alle zuerst)...
//dann kann das Zwischenergebnis leicht zu groß werden. (nicht getestet, dass war ein Problem in der Implementierung in C)
	long bin_coeff(int n, int k) {
		if(k>n) {return 0;}
		long res = 1;
		for(int i = n; i > n-k; i--) {
			res *= i;
		}
		
		for(int i = 1; i <= k; i++) {
			res = res/i;
		}			
		return res;
	}
}