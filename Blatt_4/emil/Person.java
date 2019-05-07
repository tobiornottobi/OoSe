import java.util.Objects;

public class Person implements Comparable<Person>{

	private String name;
	private String vorname;
	private int plz;
	private String straße;
	private int hausnummer;

	public Person(String name, String vorname, int plz, String straße, int hausnummer) {
		this.name = name;
		this.vorname = vorname;
		this.plz = plz;
		this.straße = straße;
		this.hausnummer = hausnummer;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVorname() {
		return this.vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public int getPlz() {
		return this.plz;
	}

	public void setPlz(int plz) {
		this.plz = plz;
	}

	public String getStraße() {
		return this.straße;
	}

	public void setStraße(String straße) {
		this.straße = straße;
	}

	public int getHausnummer() {
		return this.hausnummer;
	}

	public void setHausnummer(int hausnummer) {
		this.hausnummer = hausnummer;
	}

	@Override
	public int compareTo(Person o) {
		int comp = getName().compareTo(o.getName());
		if (comp != 0) return comp;

		comp = getVorname().compareTo(o.getVorname());
		if (comp != 0) return comp;

		if (getPlz() < o.getPlz()) return -1;
		if (getPlz() > o.getPlz()) return 1;

		comp = getStraße().compareTo(o.getStraße());
		if (comp != 0) return comp;

		if (getHausnummer() < o.getHausnummer()) return -1;
		if (getHausnummer() > o.getHausnummer()) return 1;

		return 0;
	}
	
	@Override
	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof Person)) {
			return false;
		}
		Person person = (Person) o;
		return name.equals(person.name) && vorname.equals(person.vorname) && plz == person.plz && straße.equals(person.straße) && hausnummer == person.hausnummer;
	}

	@Override
	public String toString() {
		return "Person(name='" + getName() + "'" +
			", vorname='" + getVorname() + "'" +
			", plz=" + getPlz() +
			", straße='" + getStraße() + "'" +
			", hausnummer=" + getHausnummer() + ")";
	}
}