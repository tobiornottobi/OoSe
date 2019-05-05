
public class Blatt4_3_main {
	public static Person findMin(Person[] p) {
		Person res = p[0];
		for(int i = 0; i < p.length - 1; i++) {
			if (p[i].compareTo(p[i+1]) < 0) {res = p[i+1];}
		}
		return res;
	}
	
	public static void main(String[] args) {
		Person[] p_arr = new Person[2];
		p_arr[0] = new Person("Mustermann", "Max", "44551", "1Straße3", "44b");
		p_arr[1]= new Person("Mustermann", "Max", "44551", "Straße3", "344b");
		Person p_min = findMin(p_arr);
			
		System.out.println("Name der ersten Person: " + p_min.name + "\nVorname der ersten Person: " + p_min.vorname + "\nPLZ der ersten Person: " + p_min.plz + "\nStraße der ersten Person: " + p_min.straße + "\nHausnummer der ersten Person: " + p_min.hausnummer);

	}

}
