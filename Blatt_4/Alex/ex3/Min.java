class Min {
    public static Comparable findMin(Comparable[] x) {
        int n= x.length;
        Comparable min = x[0];
        for(int i=1; i<n; i++) {
            if(min.compareTo(x[i]) < 0) min=x[i];  
        }
        return min;
    }
}