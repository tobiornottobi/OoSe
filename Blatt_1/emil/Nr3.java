public class Nr3 {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Eingabe: ");
		int k = sc.nextInt(); // liest eine Ganzzahl (int) ein
		System.out.println(++k); // Ausgabe a)
		System.out.println(k); // Ausgabe b)
		System.out.println(k++); // Ausgabe c)
		int k2 = 5;
		/*
		double result = k2 / 2; // Stelle 1
		*/
		double result = k2 / 2.0;
		System.out.println("5 / 2 = " + result); // Ausgabe d)
		boolean b = false;
		/*if(b = false) {
			System.out.println("b ist falsch."); // Ausgabe e)
		} else {
			System.out.println("b ist wahr."); // Ausgabe f)
		}*/

		System.out.println("b ist " + (b ? "wahr" : "falsch"));
	}

	/**
	 * in a) wird erst k erhöht und dann ausgegeben.
	 * in b) wird k einfach nur ausgegeben, deswegen mit a) gleich.
	 * in c) wird k erst ausgegeben, deswegen mit a) gleich und dann um eins erhöht.
	 */

	/**
	 * Stelle 1 muss zu 
	 * double result = k2 / 2.0; 
	 * geändert werden
	 */

	/**
	 * Ausgabe f kommt zustande, da "b = false" kein vergleich ist, sondern eine zuweisung, 
	 * welche den zugewiesenen Wert zurückgibt, also false.
	 */
}