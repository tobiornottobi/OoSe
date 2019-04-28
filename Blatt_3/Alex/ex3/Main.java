public class Main {

    public static void main (String[] args) {
        Stereoanlage s=new Stereoanlage();
        Playable pl=new CD();
        s.play(pl);
        pl=new Kassette();
        s.play(pl);
        // die Ausgaben sind unterschiedlich, da durch Zeile 7 der Input "pl" vom Typ CD zu Kassette gewechselt wird und die Klasse Stereoanlage somit Kassette und nicht CD aufruft, die beide das Interface Playable implementieren
    }
}