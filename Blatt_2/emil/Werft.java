public class Werft {

	public Schiff produziereSchiff(String name, double laenge, Schifffahrtsamt amt) {
		Schiff schiff = new Schiff(name, laenge);
		amt.regestriereSchiff(schiff);
		schiff.setKennzeichen(Schifffahrtsamt.getKennzeichen());
		return schiff;
	}
}