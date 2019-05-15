public class ex1 {
    public static void main (String[] args) {
        Angestellter Dave = new Angestellter("Dave","Milton",45,2250);
        System.out.println("Angestellter: " + Dave.getVorname() + ", " + Dave.getNachname() + ", " + Dave.getAlter() + " Jahre, " + Dave.getGehalt() + "€");
        Dave.erhoeheGehalt(50);
        Dave.altern();
        System.out.println("Nach Gehaltserhoehung + Altern: " + Dave.getVorname() + ", " + Dave.getNachname() + ", " + Dave.getAlter() + " Jahre, " + Dave.getGehalt() + "€");
        Praktikant Joe = new Praktikant("Joe","Smith",23);
        System.out.println("\nPraktikant: " + Joe.getVorname() + ", " + Joe.getNachname() + ", " + Joe.getAlter() + " Jahre, " + Joe.getGehalt() + "€");
        Joe.erhoeheGehalt(50);
        Joe.altern();
        System.out.println("Nach Gehaltserhoehung + Altern: " + Joe.getVorname() + ", " + Joe.getNachname() + ", " + Joe.getAlter() + " Jahre, " + Joe.getGehalt() + "€");

        System.out.println("\n\nVersuche, Praktikant mit Gehalt=1000€ zu erstellen...");
        Praktikant Liam = new Praktikant("Liam","Miller",25,1000);
        System.out.println("\nPraktikant: " + Liam.getVorname() + ", " + Liam.getNachname() + ", " + Liam.getAlter() + " Jahre, " + Liam.getGehalt() + "€");
        Liam.erhoeheGehalt(50);
        Liam.altern();
        System.out.println("Nach Gehaltserhoehung + Altern: " + Liam.getVorname() + ", " + Liam.getNachname() + ", " + Liam.getAlter() + " Jahre, " + Liam.getGehalt()+ "€");

    }
}

class Angestellter {
    String vorname;
    String nachname;
    int alter;
    int gehalt;

    public Angestellter (String vorname, String nachname, int alter, int gehalt) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.alter = alter;
        this.gehalt = gehalt;
    }

    public String getVorname () {
        return this.vorname;
    }
    public String getNachname() {
        return this.nachname;
    }
    public int getAlter() {
        return this.alter;
    }
    public int getGehalt() {
        return this.gehalt;
    }

    public void altern() {
        this.alter++;
    }

    public void erhoeheGehalt(int x) {
        this.gehalt+=x;
    }
}

class Praktikant extends Angestellter {
    int gehalt = 400;

    public Praktikant (String vorname, String nachname, int alter) {
        super(vorname,nachname,alter,400);
    }

    public Praktikant (String vorname, String nachname, int alter, int gehalt) {
        super(vorname,nachname,alter,400);
        System.out.println("Praktikanten haben ein festes Gehalt! You tried: " + gehalt + ". Wird auf 400€ gesetzt.");
    }

    public void erhoeheGehalt(int x) {
        System.out.println("Praktikatengehaelter können nicht erhöht werden!");
    }
}