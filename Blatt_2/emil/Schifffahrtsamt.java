public class Schifffahrtsamt {

	private Schiff[] schiffe = new Schiff[50];
	private int numberOfRegistertShips = 0;

	public void regestriereSchiff(Schiff schiff) {
		if (numberOfRegistertShips < schiffe.length) {
			schiffe[numberOfRegistertShips] = schiff;
		}
	}

	public void meldung(String nachricht, int dringlichkeit) {
		if (dringlichkeit == 1) {
			for (int i = 0; i < numberOfRegistertShips; i++) {
				schiffe[i].empfangeNachricht(nachricht);
			}
		}
	}

	public static String getKennzeichen() {
		java.util.Random rnd = new java.util.Random();
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 6; i++) {
			sb.append((char)((rnd.nextInt(25) + 65)));
		}
		return sb.toString();
	}
}