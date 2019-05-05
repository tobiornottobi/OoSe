
public class Blatt4_1_main {

	public static void main(String[] args) {
		Auto auto1 = new Lastwagen();
		
		System.out.println(auto1.reifen);
		/* 
		 * a)
		 * Ausgabe ist 4, aufgerufen wird also Auto.reifen.
		 * Begründung: Variablen werden aus der obersten Klasse benutzt
		 * (Methoden dagegen aus dem untersten Subtyp)
		 * b)
		 * Ausgabe ist 4, wird ja weiterhin Auto.reifen aufgerufen
		 * c)
		 * Ausgabe ist 4, wird ja weiterhin Auto.reifen aufgerufen
		 */
		
		System.out.println(((Lastwagen) auto1).reifen); 
		/*
		 * a)
		 * Ausgabe ist 8, klar denn auto1 wird als Lastwagen gecastet -
		 * also der Lastwagen.reifen Wert aufgerufen
		 * b)
		 * hier keine Änderung gegenüber a)
		 * c)
		 * hier keine Änderung gegenüber a)
		 */
		
		//System.out.println(auto1.getReifen());
		/*
		 * a)
		 * Ausgabe bleibt 8, denn auto1 bleibt als Lastwagen gecastet
		 * b)
		 * getReifen() wird aus Auto (Lastwagen.getReifen gibt es ja nicht mehr)
		 * aufgerufen, also Ausgabe 4
		 * c)
		 * Kompilierfehler: Auto.getReifen() soll aufgerufen werden, 
		 * existiert aber nicht
		 */

		
		
		System.out.println(((Lastwagen) auto1).getReifen());
		/*
		 * a)
		 * Ausgabe bleibt 8, auto1 weiterhin als Lastwagen gecastet
		 * b)
		 * wie in 3: getReifen() wird aus Auto aufgerufen, also Ausgabe 4
		 * c)
		 * Ausgabe 8, Lastwagen.getReifen() wird aufgerufen
		 */
		
	}

}
