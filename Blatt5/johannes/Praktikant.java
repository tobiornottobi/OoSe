
	public class Praktikant extends Angestellter{
		private String vorname;
		private String nachname;
		private int alter;
		private int gehalt = 400;
		public Praktikant(String vorname, String nachname, int alter) {
			this.vorname = vorname;
			this.nachname = nachname;
			this.alter = alter;
		}
		public int getGehalt() {
			return gehalt;
		}
		public void addMoney(int added) {
			System.out.println("Sie haben versucht, dass Gehalt eines Praktikanten zu erhöhen. Ihr Versuch wurde protokolliert; \nwir bitten Sie, sich in Reedukationslager 14b einzufinden. Vielen Dank für Ihre Zusammenarbeit.\n");
		}
	}