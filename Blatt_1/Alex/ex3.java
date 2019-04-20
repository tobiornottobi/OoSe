package ex3;

public class Name {
	public static void main (String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Eingabe: ");
		int k = sc.nextInt(); // liest eine Ganzzahl (int) ein
		System.out.println(++k); // Ausgabe a) : erhoeht zunaechst k um 1, gibt es dann aus (preinkrement)
		System.out.println(k); // Ausgabe b) : gibt daher gleichen Wert wie a) an
		System.out.println(k++); // Ausgabe c): gibt erneut den gleichen Wert aus und erhoeht k danach um 1(postinkrement)
		int k2 = 5;
		double result = (double) k2 / 2; // Stelle 1: damit eine Gleitkomma-Division durchgefuehrt wird, muss der double-Datentyp explizit angegeben werden 
		System.out.println("5 / 2 = " + result); // Ausgabe d)
		boolean b = false;
		/*if(b = false) {
		System.out.println("b ist falsch."); // Ausgabe e)
		} else {
		System.out.println("b ist wahr."); // Ausgabe f) kommt zustande, da die if-Abfrage keine Kontrolle "==", sondern Zurodnung "=" enthaelt. Somit ist b nach "if(b=false)" immer false zugeordnet und dann der else-Zweig erreicht.
		}*/
		System.out.println(b==false? "b ist falsch" : "b ist wahr");
	}
}
