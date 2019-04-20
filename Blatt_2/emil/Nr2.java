public class Nr2 {
	
	public static void main(String[] args) {
		System.out.println("6.5 und 6.5f sind " + ((6.5 == 6.5f) ? "gleich" : "ungleich"));
		System.out.println("6.4 und 6.4f sind " + ((6.4 == 6.4f) ? "gleich" : "ungleich"));
	}	

	/**
	 * 6.4 ist ungleich zu 6.4f, da 6.4 nicht vollständig als endliche binäre kommazahl 
	 * dargestellt werden kann und 6.4f ein float ist und deshalb kleiner und anders 
	 * gerundet ist als 6.4.
	 */
}