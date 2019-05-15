import java.util.Random;

public class ex3 {
    public static void main (String[] args) {
        double[] array = new double[10];
        Random rand = new Random();
        System.out.println("\nArraywerte: ");
        for(int i=0; i<10; i++) {
            array[i]=new Double(rand.nextDouble()*100);
            System.out.println(array[i] + ",");
        }
        array=SelectionSort(array);
        System.out.println("\nSorted:");
        for(int i=0; i<10; i++) {
            System.out.println(array[i]+ ",");
        }
    }

    public static double[] SelectionSort (double[] input) {
        int size = input.length;
        if(size == 0) return new double[0];
        double[] result = new double[size];
        int kickedout=0;
        int loopsize = size;
        for(int i=0; i<size; i++) {
            double min = input[0];
            kickedout=0;
            for(int j = 1; j<loopsize; j++){
                if(min > input[j]) {
                    min=input[j];
                    kickedout=j;
                }
            }
            loopsize--;
            result[i]=min;
            for(int k=kickedout; k<loopsize; k++) {
                input[k]=input[k+1];
            }

        }
        return result;
        
    }
}
