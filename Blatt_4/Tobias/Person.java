
//public class Person implements Comparable {
public class Person implements Comparable<Person> {
	public String name;
	String vorname;
	int postleitzahl;
	String strasze;
	int hausnummer;

	public Person(String name, String vorname, int postleitzahl, String strasze, int hausnummer){
		this.name=name; this.vorname=vorname; this.postleitzahl=postleitzahl; this.strasze=strasze; this.hausnummer=hausnummer;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}


	//public int compareTo(Object o) {
	/*
		if(!(o instanceof Person)){
		return 0;
	}
	*/

		

	public int compareTo(Person p) {
		int out=0;
		if( 0!=(out=this.name.compareTo(p.name)) ||
				0!=(out=this.vorname.compareTo(p.vorname)) ||
				0!=(out=((Integer) this.postleitzahl).compareTo(p.postleitzahl)) ||
				0!=(out=this.strasze.compareTo(p.strasze)) ||
				0!=(out=((Integer) this.hausnummer).compareTo(p.hausnummer))  )
				{
			
		}
	
		return out;
	}

}
