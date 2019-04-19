package ex4;

public class Schiff {
	private String name;
	private String sign;
	private double length;
	
	public Schiff (String name, double length) {
		this.name=name;
		this.length=length;
	}
	
	public void setKennzeichen (String kennzeichen) {
		this.sign=kennzeichen;
	}
	
	public void empfangeNachricht (String msg) {
		System.out.println("Nachricht: " + msg);
		System.out.println("Schiffsname: " + this.name);
		System.out.println("Kennzeichen: " + this.sign);
	}
}
