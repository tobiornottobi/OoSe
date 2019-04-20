package ex4;

public class Werft {
	public void produziereSchiff (String name, double length, Schiffahrtsamt amt) {
		Schiff neu = new Schiff(name,length);
		amt.addShip(neu);
		String kennzeichen = amt.getKennzeichen();
		neu.setKennzeichen(kennzeichen);
	}
}
