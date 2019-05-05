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
    Ausgabe 1: 4, denn es wird das Attribut Reifen der Klasse Lastwagen von der Klasse Auto überschrieben
    Ausgabe 2: 8, durch den expliziten Verweis auf die Lastwagenklasse wird der Wert der Reifen der Lastwagen ausgegeben
    Ausgabe 3: 8, als Tochterklasse überschreibt die getReifen()-Methode von Lastwagen die von Auto und wird ausgeführt
    Ausgabe 4: 8, das ausdrückliche Formulieren von Lastwagen als anzuwendende Klasse ändert in diesem Fall an der Ausgabe nichts, da
                die Klasse ohnehin die Klasse Auto überschrieben hätte.

b.)
    Ausgabe 1: 4, gleichbleibend, da weiterhin direkt das Attribut von Auto aufgerufen wird
    Ausgabe 2: 8, getReifen wird auch hier nicht aufgerufen, also bleibt die Ausgabe gleich
    Ausgabe 3: 4, da Lastwagen nun keine getReifen()-Methode mehr besitzt, kann sie nicht mehr die Methode von Auto überschreiben, die Methode von Auto wird ausgeführt
    Ausgabe 4: 4, auch der explizite Verweis auf Lastwagen wird auf die Klasse Auto zurückgeführt, da die Methode in der Klasse Lastwagen nicht vorhanden ist

c.)
    Ausgabe 1: 4
    Ausgabe 2: 8
    Ausgabe 3: Liefert eine Fehlermeldung, da die Methode getReifen() für den Typ Auto nicht definiert ist und die variable auto1 vom typ Auto ist.
    Ausgabe 4: 8

*/