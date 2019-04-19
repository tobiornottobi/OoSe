import java.util.Scanner;

public class Aufgabe1 {
   
    public static void main (String [] args) {
    
        Scanner pit = new Scanner(System.in);
        System.out.println("Enter fac number");
        long a = pit.nextLong();
        long result = recFac(a);
        System.out.println("The factorial of" + " "+ a + " " + "is"+ " " + result);
        Scanner pat = new Scanner(System.in);
        /*long[] vars = new long [2];
        for(int i = 0; i < vars.length; i++){
            System.out.println("Enter bio var:");
            vars [i] = pat.nextLong();
        }*/
        System.out.println("Enter x of bio");
        long x = pat.nextLong();
        System.out.println("Enter y of bio");
        long y = pat.nextLong();
        long resalt = bio(x,y);
        System.out.println("The bio of" + " " + x + " " + "over" + " " + y + " " + "is" + " " + resalt);
        System.out.println("Summary"+ "=" + summary(a,x,y));
    }
    public static long recFac (long a) {
        if (a <= 1) {
            return 1;
        }
        else {
            return a * recFac (a-1);
        }
    }
    public static long bio (long x, long y) {
        if ((x == y) || (y == 0))
        return 1;
        else 
        return bio (x-1, y) + bio (x-1, y-1);

    }
    public static long summary (long a, long x, long y){
        return bio(x,y)*recFac(a);
    }
 }
