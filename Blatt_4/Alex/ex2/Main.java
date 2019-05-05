class Main {
    public static void main (String[] args) {
        Student student = new Student();
        Cauliflower essen1= new Cauliflower();
        student.eat(essen1); // I dont like Blumenkohl an Goronzolasoße, denn durch new Cauliflower wird die Methode dieser Klasse ausgeführt, wie in Student definiert
        Spaghetti essen2 = new Spaghetti();
        student.eat(essen2);// I like Spaghetti Bologneser Art, die student.eat() Funktion wird der ersten mit dem Scope "Food food" zugeordnet und die Funktion aus Spaghetti
                            // überschreibt die von Cauliflower, da essen2 ein Objekt aus Spaghetti ist
        Food essen = new Cauliflower(); 
        student.eat(essen); // I like Blumenkohl an Gorgonzolasoße, essen ist vom Typ Food, somit wird die erste der beiden student.eat() Funktionen aufgerufen
                            // "getmeal()" bezieht sich dann wieder auf Cauliflower, da dessen Konstruktor verwendet wurde, um essen zu initialisieren
    }
}