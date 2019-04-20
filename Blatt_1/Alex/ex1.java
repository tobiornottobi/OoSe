public class name {
    public static void main(String[] args) {
    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[1]);
    int c = Integer.parseInt(args[2]);
    switch(c){
        case 1:
            System.out.println("Summe: " + a + " + " + b + " = " + (a+b));
            break;
        case 2:
            System.out.println("Differenz: " + a + " - " + b + " = " + (a-b));
            break;
        case 3:
            System.out.println("Produkt: " + a + " * " + b + " = " + (a*b));
            break;
        case 4:
            System.out.println("Quotient: " + a + " / " + b + " = " + (a/b));
            break;
        default:
            System.out.println("Fehlerhafte Eingabe!");
            break;
    }
    
    }
}