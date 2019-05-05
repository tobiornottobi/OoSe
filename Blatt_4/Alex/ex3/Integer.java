public class Integer implements Comparable<Integer> {
    int data;

    public Integer(int x) {
        this.data=x;
    }

    public int compareTo (Integer x) {
        if(x instanceof Integer) {
            if(this.data == x.data) return 0;
            else if(this.data > x.data) return -1;
            else return 1;
        }
        else return -1000;
    }
}