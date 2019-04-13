public class Operatoren {
public static void main(String [] args){
int a=15;
int b=34;
int c=1;
System.out.println("1: "+ (a==b));
System.out.println("2: "+ (a==b-19));
System.out.println("3: "+ (a^b));
System.out.println("4: "+ (a++^b));
System.out.println("5: "+ (7<<++c));
System.out.println("6: "+ (a=b=c=0x10));
System.out.println("7: "+ (1e1));
}
}
}

/*  1. checkt ob a genau gleich b ist also false
    2. checkt ob a genau gleich b ist und zieht von b -19 ab also true da 34-19=15 und a= 15
    3. zaheln binär und dann xor vergleich
    4. gleiche wie 3 erhöt aber a nach der ausgabe
    5.7 left shitf bits um 2 also 28 und c wird  erhöt. 
    6.0x = number in hexadecimal also a,b unc auf 10 hexadecimal
    7.1+ eine 0 stelle also = 10 oder auch  1^10 oder auch 1e+1
