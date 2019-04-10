public class Operatoren {
	public static void main(String [] args){
		int a=15;
		int b=34;
		int c=1;
		System.out.println("1: " + (a==b));
		//false, da a und b nicht die gleiche Zahl sind
		System.out.println("2: " + (a==b-19));
		//true da a(15) und b-19(15) die gleiche Zahl sind
		System.out.println("3: " + (a^b));
		//bitweise xor von a und b
		//a: 001111
		//b: 100010
		//---------
		//o: 101101 = 45
		System.out.println("4: " + (a++^b));
		// selbe wie 3. a wird erst nach berechnung erhöht
		System.out.println("5: " + (7<<++c));
		//c wird auf 2 erhöht. 7 wird um 2 nach links geschiftet also mit 2^2 multipliziert. 7 * 4 = 28
		System.out.println("6: " + (a=b=c=0x10));
		//a, b, c werden auf 10 in hex gesetzt also 16 in dez. zuweisungen geben ihren Wert zurück
		System.out.println("7: " + (1e1));
		//1e1 beudeutet 1 * 10 hoch 1 also 10
	}
}