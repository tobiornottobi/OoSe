
public class Schifffahrtsamt {

	private Schiff[] schiffArr = new Schiff[50];
	private int arrcur=0;
	//new Array<Schiff>(50);
	public void registriereSchiff(Schiff schiff) {
		this.schiffArr[arrcur]=schiff;
		arrcur++;
	}
	
	public void meldung(String nachricht, int dringlichkeit){
		//int dðæøþȧχǥ=2;
		if (dringlichkeit==1){
			for(int i=0; i<arrcur; i++)
			{
				schiffArr[i].empfangeNachricht(nachricht);
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
/*
 	public static void main(String[] args)
 
	{
		
	}
*/	
}
