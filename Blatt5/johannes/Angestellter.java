
public class Angestellter {
	private String vorname;
	private String nachname;
	private int alter;
	private int gehalt;
	
	public String getVorname() {
		return this.vorname;
	}
	public String getNachname() {
		return this.nachname;
	}
	public int getAlter() {
		return this.alter;
	}
	public int getGehalt() {
		return this.gehalt;
	}

	
	public Angestellter() {}
	public Angestellter(String vorname, String nachname, int alter, int gehalt) {
		this.vorname = vorname;
		this.nachname = nachname;
		this.alter = alter;
		this.gehalt = gehalt;			
	}
	public void addYear() {
		this.alter += 1;
	}
	public void addMoney(int added) {
		this.gehalt += added;
	}
}
