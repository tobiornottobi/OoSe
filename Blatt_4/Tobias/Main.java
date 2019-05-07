
public class Main {

	public static void main(String[] args) {
		Auto auto1 = new Lastwagen();
		System.out.println(auto1.reifen); // Ausgabe 1)
		System.out.println(((Lastwagen) auto1).reifen); // Ausgabe 2)
		System.out.println(auto1.getReifen()); // Ausgabe 3)
		System.out.println(((Lastwagen) auto1).getReifen()); // Ausgabe 4)
	}
	//1a	//Die Felder werden im Gegensatz zu den Funktionen von der statischen Klasse aufgerufen, da nicht gecastet wurde.
			//Funktionen werden immer von der dynamischen Klasse aufgerufen und durch Casten kann die statische Klasse auch zur Unterklasse gemacht werden.
	//1b	//natürlich, denn die dynamische Klasse hat die Funktion nicht mehr, daher wird das Feld der statischen Klasse ge-get-tet.
	//1c	//Compilation-error. Es können nur Funktionen aufgerufen werden, die auch Teil der statischen Klasse sind.
}
