
public class Blatt5_4_main {
	public static void main(String[] args) {
		CallEg eg = new CallEg(); 
		// use default constructor
		try {
			eg.methodA();
			} 
		catch (ArithmeticException oops) {
			oops.printStackTrace();
		}		
	}
	/*
	 * Liefert das Resultat:
	 * java.lang.ArithmeticException: / by zero
	at CallEg.methodC(CallEg.java:23)
	at CallEg.methodB(CallEg.java:13)
	at CallEg.methodA(CallEg.java:4)
	at Blatt5_4_main.main(Blatt5_4_main.java:7)
	*
	* Keine Ahnung, was der Sinn der Aufgabe ist?
	 */
}
