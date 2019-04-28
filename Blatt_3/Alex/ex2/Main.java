public class Main {

    public static void main (String[] args) {
        Fur ten = new Fur(10);
        Sheep sheep1 = new Sheep("schaefchen",ten);
        Sheep sheep2 = sheep1.clone();
        System.out.println("Teilaufgabe a.)\n");
        System.out.println(sheep1.toString());
        System.out.println(sheep2.toString());
        sheep2.changeName("neuesschaefchen");
        sheep2.shear();
        System.out.println(sheep1.toString());
        System.out.println(sheep2.toString());
        //es fällt auf, dass eine Veränderung des Klons gleichzeitig eine Veränderung des ursprünglichen Objekts zur Folge hat. Es handelt sich also lediglich um einen Pointer auf ein und denselben Speicherplatz

        
        
        //shallow cloning erfolg wie in Teilaufgabe 1: verändert man den Klon, so hat dies auch Auswirkungen auf das Ursprungsobjekt
        System.out.println("\nTeilaufgabe b.) : shallowcloning\n");
        ten.setLength(10);
        Sheep sheep1shallow = new Sheep("schaefchen",ten);
        Sheep sheep2shallow = sheep1shallow.shallowCopy();
        System.out.println(sheep1shallow.toString());
        System.out.println(sheep2shallow.toString());
        sheep2shallow.changeName("neuesschaefchen");
        sheep2shallow.shear();
        System.out.println(sheep1shallow.toString());
        System.out.println(sheep2shallow.toString());
        System.out.println("Klon equals Basis?  " + sheep1shallow.equals(sheep2shallow));


        //deep cloning erstellt ein komplett neues Objekt und weist ihm die Werte des Ursprungsobjekts zu. Somit kann man den Klon ändern, ohne das eigentliche Objekt zu beeinträchtigen.
        //daher ändert sich die Ausgabe, nun wird nur noch der Klon umbenannt und geschoren, das Grundobjekt behält Namen und Fellänge
        System.out.println("\nTeilaufgabe b.): deepcloning\n");
        ten.setLength(10);
        Sheep sheep1deep = new Sheep("schaefchen",ten);
        Sheep sheep2deep = new Sheep("schaefchen",ten);
        sheep2deep=sheep1deep.deepCopy(sheep2deep);
        System.out.println(sheep1deep.toString());
        System.out.println(sheep2deep.toString());
        sheep2deep.changeName("neuesschaefchen");
        sheep2deep.shear();
        System.out.println(sheep1deep.toString());
        System.out.println(sheep2deep.toString());
        System.out.println("Klon equals Basis?  " + sheep1deep.equals(sheep2deep));

        /* Aufgabenteil d:
            Das Interface Cloneable dient in Java dazu, eine deep copy eines Objekts zu erzeugen, es also exakt in einen neuen Speicherbereich zu kopieren, sodass ein neues Objekt mit den Attributwerten eines
            bereits existenten Objekts erstellt wird.
        */

    }
}