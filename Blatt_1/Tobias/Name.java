public class Name {
public static void main(String[] args) {
System.out.println("Hallo " + args[0] + "!");

int i2=Integer.parseInt(args[2]);
int i3=Integer.parseInt(args[3]);
    switch (Integer.parseInt(args[4]))
    {
        /*case 0:
            System.out.println("");
            break;*/
        case 1:
            System.out.println("a+b=" + (i2+i3));
            break;
        case 2:
            System.out.println("a-b=" + (i2-i3));
            break;
        case 3:
            System.out.println("a·b=" + (i2*i3));
            break;
        case 4:
            System.out.println("a÷b=" + (i2/i3));
            break;
        default:
            System.out.println("using default: a+b=" + i2+i3);

            break;
    }
}
}
