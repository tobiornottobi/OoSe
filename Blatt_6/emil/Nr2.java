import java.io.*;

public class Nr2 {

	static public class Hamburger extends Fastfood {
		void eat() throws RuntimeException { }
	}

	static class Fastfood {
		void eat() throws IOException { }
	}

	static public class Maincl {
		public static void main(String[] args) throws IOException {
			Hamburger c = new Hamburger();
			c.eat();
		}
	}
}

/**
 * a) geht, da keine neudeklaration. wird von superklasse genommen
 * b) geht nicht, da IOException keine supertyp von Exception ist
 * c) geht, da nichts überschrieben wird
 * d) geht, da IOException ein supertyp von FileNotFoundException ist
 * e) geht, da RuntimeException eine unchecked Exception ist
 */
