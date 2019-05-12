
public class Blatt5_1_main {
	public static void main(String[] args) {
		Angestellter ang = new Angestellter("Max", "Angestellter", 43, 2210);
		Angestellter pra = new Praktikant("Andreas", "Praktikant", 22);
		ang.addMoney(430);
		pra.addMoney(430);
		
		//Test
		pra = (Angestellter) pra;
		pra.addMoney(100);
		
		System.out.println("Angestellter: " + ang.getGehalt() );
		System.out.println("Praktikant: " + pra.getGehalt() );
	}

}
