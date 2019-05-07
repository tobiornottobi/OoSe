public class Nr1 {

	public static class Auto {
		int reifen = 4;

		int getReifen() {
			return this.reifen;
		}
	}
	
	public static class Lastwagen extends Auto {
		int reifen = 8;

		int getReifen() {
			return this.reifen;
		}
	}
	
	public static void main(String[] args) {
		Auto auto1 = new Lastwagen();
		System.out.println(auto1.reifen); // Ausgabe 1)
		System.out.println(((Lastwagen) auto1).reifen); // Ausgabe 2)
		System.out.println(auto1.getReifen()); // Ausgabe 3)
		System.out.println(((Lastwagen) auto1).getReifen()); // Ausgabe 4)
	}

	/**
	 * a)
	 * 1: "4", da das feld aus dem typ der variable genommen wird.
	 * 2: "8", da das feld aus dem typ der variable genommen wird.
	 * 3: "8", da implementation des dynamischen Typen genommen wird
	 * 4: "8", da implementation des dynamischen Typen genommen wird
	 */

	 /**
	 * b)
	 * ja bei 3, 4 wird dann die superimplementation genutz
	 */

	 
	 /**
	 * c)
	 * alles kaputt
	 */
}