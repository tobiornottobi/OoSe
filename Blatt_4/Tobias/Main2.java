
public class Main2 {


		
	public static void main(String[] args) {
		Cauliflower essen1 = new Cauliflower();
//		student.eat(essen1);
		//a) Welche Ausgabe erzeugt der folgende Aufruf? Warum?
		//keinen, denn es gibt kein Objekt Student
		Student student=new Student();
		student.eat(essen1);
		//"I don't like …", weil die spezifischere Funktion aufgerufen wird.
		
		Spaghetti essen2 = new Spaghetti();
		student.eat(essen2);
		//I like, denn es gibt ja keine Spaghetti-Funktion in der Klasse
		
		Food essen = new Cauliflower();
		student.eat(essen);
		//Der statische Typ ist "Food", daher wird die Food-Funktion aufgerufen
		
	}

}
