public class Main {
    public static void main (String[] args) {
        Auto auto1 = new Lastwagen();
        System.out.println(auto1.reifen); // Ausgabe 1)
        System.out.println(((Lastwagen) auto1).reifen); // Ausgabe 2)
        //System.out.println(auto1.getReifen()); // Ausgabe 3)
        System.out.println(((Lastwagen) auto1).getReifen()); // Ausgabe 4)
    }
}

/* 
a.)
    Ausgabe 1: 4, denn der statische Typ von auto1 ist Auto, somit überdeckt das Attribut reifen von Auto jenes von Lastwagen.
    Ausgabe 2: 8, durch den expliziten Cast auf die Lastwagenklasse wird der Wert der Reifen der Lastwagen ausgegeben.
    Ausgabe 3: 8, als Tochterklasse überschreibt die getReifen()-Methode von Lastwagen die von Auto (der dynamische Typ von auto1 ist hier Lastwagen, damit wird getReifen() dynamisch gebunden) und wird ausgeführt.
    Ausgabe 4: 8, der ausdrückliche (statische) Cast zu Lastwagen als anzuwendende Klasse ändert in diesem Fall an der Ausgabe nichts, siehe Ausgabe 3.

b.)
    Ausgabe 1: 4, gleichbleibend, da weiterhin direkt das Attribut von Auto aufgerufen wird.
    Ausgabe 2: 8, getReifen() wird auch hier nicht aufgerufen, also bleibt die Ausgabe gleich, siehe Ausgabe 2 von a).
    Ausgabe 3: 4, da Lastwagen nun keine getReifen()-Methode mehr besitzt, kann sie nicht mehr die Methode von Auto überschreiben, die Methode von Auto wird ausgeführt.
    Ausgabe 4: 4, auch der explizite Cast zu Lastwagen wird auf die Super-Klasse Auto zurückgeführt, da die Methode in der Klasse Lastwagen nicht vorhanden ist.

c.)
    Ausgabe 1: 4, analog a.) und b.)
    Ausgabe 2: 8, analog a.) und b.)
    Ausgabe 3: Liefert eine Fehlermeldung, da die Methode getReifen() für den Typ Auto nicht definiert ist und die variable auto1 vom statischen Typ Auto ist.
    Ausgabe 4: 8, der explizite Cast zum Sub-Typ Lastwagen macht den Aufruf der nun Lastwagen-eigenen Funktion get-Reifen möglich. Durch den Cast wird die, sonst überdeckte, Reifenvaiable von Lastwagen ausgegeben.

*/