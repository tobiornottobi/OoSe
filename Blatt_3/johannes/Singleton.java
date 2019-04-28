
public class Singleton {
	//private Singleton-Variable s
	private static Singleton s;
	int i;
	
	//Überschreiben des Konstruktors
	private Singleton(int i) {this.i = i;}
	
	//Einmaliges Setzen eines Singleton-Objekts
	public static Singleton new_s () {
		if(Singleton.s == null) {
			Singleton.s = new Singleton(142);
		}
		return Singleton.s;
	}
}
