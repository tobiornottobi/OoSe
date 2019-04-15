public class Aufgabe3 {
	public static void main(String[] args) {
java.util.Scanner sc = new java.util.Scanner(System.in);
System.out.println("Eingabe: ");
int k = sc.nextInt(); // liest eine Ganzzahl (int) ein
System.out.println(++k); // Ausgabe a)
System.out.println(k); // Ausgabe b)
System.out.println(k++); // Ausgabe c)
int k2 = 5;
double result = k2 / 2; // Stelle 1
System.out.println("5 / 2 = " + result); // Ausgabe d)
boolean b = false;
if(b = false) {
System.out.println("b ist falsch."); // Ausgabe e)
} else {
System.out.println("b ist wahr."); // Ausgabe f)
}

/* A  a) Ausgabe a gibt k wird durch ++k zuerst erhöht dann ausgegeben
      b) Ausgabe b gibt einfach das ergebnis von Ausgabe a wieder aus
      c) Ausgabe c gibt das ergebnis von Ausgabe b aus und erhöt erst nach der Ausgabe den Wert
   B  /2 darf nicht als integer aufgefasst werden muss also demnach in 2.0 geändert werden
   
   C  b wird false zugewiesen und kein vergleich aufgestellt
