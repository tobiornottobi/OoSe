
public class Schiff {
	private String name;
	private String kenn;
	private double laenge;
	public Schiff(String n, double l) {
		name = n;
		laenge = l;
	}
	
	void setKennzeichen(String kennzeichen) {
		kenn = kennzeichen;
	}
	
	void empfangeNachricht(String msg){
		//falsch verstanden
		/*String res[]=new String[3];
		res[0] = msg;
		res[1] = name;
		res[2] = kenn;
		return res; */
		
		System.out.println("Empfangen von " + name + "/" + kenn + ": " + msg);
	}
}