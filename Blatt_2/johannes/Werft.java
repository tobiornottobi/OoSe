
public class Werft {
	void produziereSchiff(String name, double laenge, Schifffahrtsamt amt) {
		Schiff s = new Schiff(name, laenge);
		amt.reg_Schiff(s);
		String kenn = amt.getKennzeichen();
		s.setKennzeichen(kenn);
	}
}
