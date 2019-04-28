
public class Blatt3_2_main {
	
	public static void main(String[] args) {
		//a)
		Fur f = new Fur(10);
		Sheep s = new Sheep("Sheep1", f);
		Sheep s_clone = s.clone();
		System.out.print(s.toString());
		System.out.print("\n");
		System.out.print(s_clone.toString());
		System.out.print("\n");
		System.out.print("\n");
		s_clone.shear();
		System.out.print(s.toString());
		System.out.print("\n");
		System.out.print(s_clone.toString());
		System.out.print("\n");

		//Ändern des Zustands des Klons ändert auch den Zustand des Originals
		//Genauer: Fur "f" ist ein eigenes Objekt. Klonen von "s" ändert nichts an f -> beide Klone verweisen auf das 
		//gleiche Fur-Objekt.
		
		//b)
		Fur f_b = new Fur(20);
		Sheep s_b1 = new Sheep("Sheep_b1", f_b);
		System.out.print("\n");
		Sheep s_b1_shallow = s_b1.shallow_clone();
		
		Fur f_b2 = new Fur(20);
		Sheep s_b2 = new Sheep("Sheep_b2", f_b2);
		System.out.print("\n");
		Sheep s_b2_deep = s_b2.deep_clone();
		System.out.print("\n");
		
		s_b1_shallow.shear();
		s_b2_deep.shear();
		
		
		System.out.print(s_b1.toString());
		System.out.print("\n");
		System.out.print(s_b1_shallow.toString());
		System.out.print("\n");
		System.out.print(s_b2.toString());
		System.out.print("\n");
		System.out.print(s_b2_deep.toString());
		
		System.out.print("\n");
		System.out.print("\n");
		//1. Vergleich
		System.out.print(s_b1.equals(s_b1_shallow));
		System.out.print("\n");
		//2. Vergleich
		System.out.print(s_b2.equals(s_b2_deep));
		
		//c
		//Test für equals-Methode:
		Fur f_test = new Fur(20);
		Sheep s_test = new Sheep("Sheep_b2", f_test);
		System.out.print("\n");
		//3. Vergleich
		System.out.print(s_b2.equals(s_test));
		
		if(s_b2.name == s_test.name && s_b2.fur.length == s_test.fur.length) {
			System.out.print("\n");
			System.out.print("Gleicher Name, gleiche Länge");
		}
		//d)
		//Sheep s_i = s_b2.implemented_clone();
		//Exception - clone() aus Interface Cloneable ist nur für spezifische Klassen implementiert. 
	}
}