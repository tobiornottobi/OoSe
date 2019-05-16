
public class Praktikant extends Angestellter{

	protected int gehalt=400;

	public Praktikant(String vnam, String nnam, int alter)
	{
		super(vnam, nnam, alter, 400);
	}
	
	
	public void gherh(int betrag){
		throw new UnsupportedOperationException("Das Gehalt eines Praktikanten liegt konstant bei 400€");
	}
}
