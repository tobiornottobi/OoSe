
public class Aufg03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Eingabe: ");
		int k = sc.nextInt(); // liest eine Ganzzahl (int) ein
		System.out.println(++k); // Ausgabe a)
		System.out.println(k); // Ausgabe b)
		System.out.println(k++); // Ausgabe c)
		int k2 = 5;
		double result = (double) k2 / 2; // Stelle 1
		System.out.println("5 / 2 = " + result); // Ausgabe d)
		boolean b = false;
		if(b = false) {
		System.out.println("b ist falsch."); // Ausgabe e)
		} else {
		System.out.println("b ist wahr."); // Ausgabe f)
		
		/*
		a) k wird eingelesen und erhöht, dann ausgegeben, dann erneut ausgegeben, dann ein letztes Mal ausgegeben und anschließend erneut erhöht.
			k2 wird auf 5 gesetzt und eine Integerdivision 5/2 wird durchgeführt. (Folge: Abrundung)
			Der Check auf boolean b misslingt, da ein = fehlt.
		b) k2 muss zum float oder double konvertiert werden: (double) k2/2
		c) Der Check auf boolean b misslingt, da ein = fehlt.
		*/
		System.out.println("a) k wird eingelesen und erhöht, dann ausgegeben, dann erneut ausgegeben, dann ein letztes Mal ausgegeben und anschließend erneut erhöht.\n k2 wird auf 5 gesetzt und eine Integerdivision 5/2 wird durchgeführt. (Folge: Abrundung)\n Der Check auf boolean b misslingt, da ein = fehlt.");
		System.out.println("b) k2 muss zum float oder double konvertiert werden: (double) k2/2");
		System.out.println("c) Der Check auf boolean b misslingt, da ein = fehlt.");

		
			
		System.out.println(b==false ? ("b ist falsch") : ("b ist wahr"));
		}

	}

}
