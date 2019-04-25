
public class Schiff {


	private String name;
	private String kennzeichen;
	private double laenge;
	
	public Schiff(String name, double laenge)
	{
		this.name= name;
		this.laenge=laenge;
		//this. bezieht sich auf die Klasse/das Objekt
	}
	
	public void setKennzeichen(String kennzeichen)
	{
		this.kennzeichen=kennzeichen;
	}
	
	public void empfangeNachricht(String msg)
	{
		System.out.println("\nNachricht: " + msg + "\nSchiffsname: " + name + "\nKennzeichen: " + kennzeichen + "\n\n" );
	}
}
