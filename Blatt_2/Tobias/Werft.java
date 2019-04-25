
public class Werft {
	public void produziereSchiff(String name, double länge, Schifffahrtsamt amt){
		Schiff schiff1a=new Schiff(name, länge);
		schiff1a.setKennzeichen(Schifffahrtsamt.getKennzeichen());
	}


}
