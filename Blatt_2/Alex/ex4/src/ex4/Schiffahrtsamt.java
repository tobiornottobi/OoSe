package ex4;

public class Schiffahrtsamt {
	Schiff schiffe[] = new Schiff[50];
	int savedships;
	
	public void addShip (Schiff s) {
		if(savedships==50) {
			System.out.println("Das Schiffahrtsamt ist voll!");
		}
		else {
			schiffe[savedships]= s;
			savedships+=1;
		}
		
	}
	
	public void meldung (String nachricht, int dringlichkeit) {
		if(dringlichkeit == 1) {
			for(int i=0; i<savedships; i++) {
				schiffe[i].empfangeNachricht(nachricht);
			}
		}
	}
	
	public static String getKennzeichen() {
		java.util.Random rnd = new java.util.Random();
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 6; i++) {
		sb.append((char)((rnd.nextInt(25)+65)));
		}
		return sb.toString();
	}
}
