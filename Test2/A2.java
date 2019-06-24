
public class A2 {

	public static void main(String[] args) {
		int[] arr=A1.primzahlenZwischen(1, 4000);
		for (int i=0; arr[i]!=0;i++) {
			System.out.println(arr[i]+" ");
			
			//ERWEITERUNG siehe A3
		}
	}

}

class PrimzahlRechner extends Thread {
	private int[] ergebnis;
	private int x, y;
	PrimzahlRechner(int x, int y){
		this.x=x; this.y=y;
	}
	
	public int[] getErgebnis() {
		return ergebnis;
	}

	public void setErgebnis(int[] ergebnis) {
		this.ergebnis = ergebnis;
	}
	
	//public static void errechnen(int x, int y){
	public void run() {
		ergebnis=A1.primzahlenZwischen(x, y);
		/*
		for (int i=0; arr[i]!=0;i++) {
			System.out.println(arr[i]+" ");
		}
		*/
	}

}