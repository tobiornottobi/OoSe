import java.util.Random;

public class Main {

    public static void main (String[] args) {
        //Aufruf mit Person-Array
        Person[] personen= new Person[3];
        personen[0] = new Person("Mustermann", "Max", 31584, "Hauptstrasse", 22);
        personen[1] = new Person("Musterfrau", "Emilia", 54221, "Nebengasse", 10);
        personen[2] = new Person("Mueller", "Alfred", 60833, "Weg", 18);
        Min comparator = new Min();
        System.out.println("Kleinster Wert: ");
        Person min;
        min = (Person) comparator.findMin(personen);
        System.out.println(min.vorname + " " + min.name + ",\n" + min.plz + ",\n" + min.strasse + ", " + min.hn);

        //Aufruf mit Integer-Array:
        Integer[] array = new Integer[5];
        Random rand = new Random();
        System.out.println("\nArraywerte: ");
        for(int i=0; i<5; i++) {
            array[i]=new Integer(rand.nextInt(100));
            System.out.println(array[i].data + ",");
        }
        Integer arraymin = (Integer) comparator.findMin(array);
        System.out.println("\n\nMinimaler Wert im Array: " + arraymin.data);
    }
}