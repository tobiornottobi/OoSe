import java.lang.UnsupportedOperationException;

public class Praktikant extends Angestellter {

	public Praktikant(String vorname, String nachname, int alter) {
		super(vorname, nachname, alter, 400);
	}

	public void raise(int amount) {
		throw new UnsupportedOperationException();
	}
}