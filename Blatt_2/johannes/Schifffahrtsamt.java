
public class Schifffahrtsamt {
	Schiff schiffe[] = new Schiff[50];
	void reg_Schiff(Schiff s) {
		for(int i = 0; i < 50; i++) {
			if(schiffe[i] == null) {
				schiffe[i] = s;
				break;
			}			
		}
	}
	void meldung(String nachricht, int dringlichkeit) {
		if(dringlichkeit == 1) {
			int i = 0;
			while(schiffe[i] != null) {
				schiffe[i].empfangeNachricht(nachricht);
				i++;
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
