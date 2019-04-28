
public class Singleton2 {
	//private Singleton-Variable s2 wird sofort gesetzt
	private static Singleton2 s2 = new Singleton2(10);
	int i;
		
	//Überschreiben des Konstruktors
	private Singleton2(int i) {
		this.i = i;
	}
	
	//klone Verweis auf einziges Singleton2-Objekt s2
	public static Singleton2 shallow_clone() {
		return s2;
	}
		
}

