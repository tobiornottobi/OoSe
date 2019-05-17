class CallEg {
    public void methodA() throws ArithmeticException{
        try {
            methodB();
        }
        catch (ArithmeticException oops) {
            oops.printStackTrace();
        }
}
    public void methodB() throws ArithmeticException{
        try {
            methodC();
        }
        catch (ArithmeticException oops) {
            oops.printStackTrace();
        }
}
    public void methodC() throws ArithmeticException{
        try {
            int i = 3/0;
        }
        catch (ArithmeticException oops) {
            oops.printStackTrace();
        }
    }
}

public class TestTrace {
    public static void main(String[] args) {
        CallEg eg = new CallEg(); //use default constructor
        try {
            eg.methodA();
        } catch (ArithmeticException oops) {
            oops.printStackTrace();
        }
    }
}

/*
    a.)
        Der Stacktrace weist auf einen "division by zero" Fehler in methodA() hin, der Stack zeigt ebenfalls, dass die Methode in main augerufen wurde.

    b.)
        Hier gibt der Stacktrace den Pfad von Main-Aufruf - methodA() - methodB() - methodC() - Division by zero an.
    c.)
        Jede Methode liefert nun ihre "eigene" Exception, beginnend bei methodC(), in der die Division durch Null versucht wird, den Pfad zurück verfolgend bis zum Aufruf innerhalb der main()-Methode von TestTrace

*/