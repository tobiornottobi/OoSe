package ex4;

public class Operatoren {
	public static void main(String [] args){
		int a=15;
		int b=34;
		int c=1;
		System.out.println("1: "+ (a==b)); //false, "a==b" prueft a und b auf Gleichheit und gibt booleschen Wert zurueck, hier false, da a!=b
		System.out.println("2: "+ (a==b-19)); //true, siehe "1:", hier sind die Ausruecke a und b-19 identisch da a= 15 = 34-19 = b-19
		System.out.println("3: "+ (a^b)); //45, errechne das Ergebnis von a XOR b bitweise, ergibt 001111 XOR 100010 = 101101 = 45
		System.out.println("4: "+ (a++^b));// berechnet das gleiche wie "3:" und erhoeht dann a um 1 (Postinkrement)
		System.out.println("5: "+ (7<<++c)); //28, zuerst wird c per Preinkrement um 1 auf 2 erhoeht, dann die 7 diese c=2 -mal bitweise nach links geshiftet, also vervierfacht
		System.out.println("6: "+ (a=b=c=0x10));//16, a, b und c wird die hexadezimale 16 zugeordnet und auch ausgegeben, da in Java eine Zuordnung auch einen Rueckgabewert liefert
		System.out.println("7: "+ (1e1));//10, 1e1 ist die wissenschaftliche Schreibweise von 1* 10^1
	}
}
