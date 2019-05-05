
class Person implements Comparable<Person> {
	String name;
	String vorname;
	String plz;
	String straﬂe;
	String hausnummer;
	public Person(String name, String vorname, String plz, String straﬂe, String hausnummer) {
		this.name = name;
		this.vorname = vorname;
		this.plz = plz;
		this.straﬂe = straﬂe;
		this.hausnummer = hausnummer;
	}
	public int compareTo(Person p) {
		//Aufgabenstellung ist etwas unklar... was bedeutet "kleiner" bei Personen
		//hier umgesetzt: Sortieren nach name/vorname/plz/straﬂe/hausnummer
		int dif = 0;
		if((p instanceof Person) == true) {
			//hier Aufruf von compareTo aus library
			dif = p.name.compareTo(this.name);
			if(dif != 0) {return dif;}
			
			dif = p.vorname.compareTo(this.vorname);
			if(dif != 0) {return dif;}
			
			dif = p.plz.compareTo(this.plz);
			if(dif != 0) {return dif;}
			
			dif = p.straﬂe.compareTo(this.straﬂe);
			if(dif != 0) {return dif;}
			
			dif = p.hausnummer.compareTo(this.hausnummer);
			if(dif != 0) {return dif;}
		}
		//nur, wenn alles gleich ist, also dif = 0
		return dif;
	}
}
