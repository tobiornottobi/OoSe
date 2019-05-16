class Angestellter {
	private String vorname;
	private String nachname;
	private int alter;
	private int gehalt;

	public Angestellter(String vorname, String nachname, int alter, int gehalt) {
		this.vorname = vorname;
		this.nachname = nachname;
		this.alter = alter;
		this.gehalt = gehalt;
	}

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

	public void age() {
		++alter;
	}

	public void raise(int amount) {
		gehalt += amount;
	}

	@Override
	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof Angestellter)) {
			return false;
		}
		Angestellter angestellter = (Angestellter) o;
		return vorname.equals(angestellter.vorname) && nachname.equals(angestellter.nachname) && alter == angestellter.alter && gehalt == angestellter.gehalt;
	}

	@Override
	public int hashCode() {
		return vorname.hashCode() + nachname.hashCode() + alter + gehalt;
	}

	@Override
	public String toString() {
		return "{" +
			" vorname='" + getVorname() + "'" +
			", nachname='" + getNachname() + "'" +
			", alter='" + getAlter() + "'" +
			", gehalt='" + getGehalt() + "'" +
			"}";
	}
	
}