
public class Blatt3_1_main {
	//Anmerkung: Aufgabenstellung definiert "class C1" - dann kann kein "static int" darin deklariert werden!
	static class C1 {
		static int s=1;
		void f1(){System.out.println("C1::f1");}
		void f2(){System.out.println("C1::f2");}
	}
	//Anmerkung: Aufgabenstellung definiert "class C2" - dann kann kein "static int" darin deklariert werden!
	static class C2 extends C1 {
		static int s=2;
		void f1(){System.out.println("C2::f1");}
		void f3(){System.out.println("C2::f3");}
	}	
	public static void main(String[] args) {
		C1 a=new C2();
		C2 b=new C2();
		
		//1.
		((C2) a).f1();
		//liefert "C2::f1" - logisch, aufgerufen wird C2.f1
		
		//2.
		((C1) b).f1();
		//liefert "C2::f1" - aufgerufen wird C2.f1, Instanz b wird nicht in die vorhergehende Klasse b1 konvertiert
		
		//3.
		System.out.println(a.s);
		//liefert "1" [=C1.s], keine Ahnung warum, hätte das Gegenteil vermutet...
		
		//4.
		b.f1();
		//liefert "C2::f1" - logisch, aufgerufen wird C2.f1
		
		//5.
		b.f2();
		//liefert "C1::f2" - Methode der oberen Klasse wird aufgerufen, weil nicht überschrieben in Subtyp
		
		//6.
		b.f3();
		//liefert "C2::f3" - logisch, aufgerufen wird C2.f3
		
		//7.
		//C1 c = new C1(); 
		//c.f3();
		//Kompilierfehler -> c ist von Klasse C1; die Methode aus dem Subtyp kann natürlch nicht aufgerufen werden.
		
		//8.	
		//C1 c = new C1(); 
		//((C2) c).f1();
		//Laufzeitfehler: c von Klasse C1 kann nicht "nachträglich" in Klasse C2 gecastet werden.
	}
}
