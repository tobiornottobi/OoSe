
public class Blatt2_2_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean test1 = false;
		double s1 = 6.5f;
		double s2 = 6.5;
		if(s1 == s2) {test1 = true;}
		
		double t1 = 6.4f;
		double t2 = 6.4;
		boolean test2 = false;
		if(t1 == t2) {test2 = true;}
		System.out.println("6.5 == 6.5f? " + test1 + " / 6.4 = 6.4f? " + test2);
	}
	
	//Zur Frage: Die Zahlen werden nach IEEE in binäre Darstellung übertragen; s1 in double, s2 in float.
	//Ob die beiden nach Konvertierung gleich erkannt werden, hängt davon ab, ob auf dem Weg gerundet werden muss
	//Ist die binäre Darstellung z.B. periodisch, dann wird bei float und double an unterschiedlichen Stellen gerundet.

}
