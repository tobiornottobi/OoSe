
public class Blatt2_4_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Schifffahrtsamt amt=new Schifffahrtsamt();
		Werft w1=new Werft();
		w1.produziereSchiff("Gertrut", 12.5, amt);
		Schiff sc1=new Schiff("Merlin", 45.9);
		amt.reg_Schiff(sc1);
		sc1.setKennzeichen(Schifffahrtsamt.getKennzeichen());
		amt.meldung("Havarie im Rhein bei Rheinkilometer 591.", 1);
		
		//Ausgabe Empfangen von Gertrut/IHVMXW:  Havarie im Rhein bei Rheinkilometer 591.
		//Empfangen von Merlin/VPBJQW:  Havarie im Rhein bei Rheinkilometer 591.
		amt.meldung("Sonnenschein bei Rheinkilometer 650", 0);
	}

}
