class CallEg {
	public void methodA() throws ArithmeticException {
		// int a=1/0;
		try{
			methodB();
		} catch(ArithmeticException e) {
			throw e;
		}
	}

	public void methodB() throws ArithmeticException {
		try{
			methodC();
		} catch(ArithmeticException e) {
			throw e;
		}	}

	public void methodC() throws ArithmeticException {
		try{
			int a = 1 / 0;
		} catch(ArithmeticException e) {
			e.printStackTrace();
			throw e;
		}
	}
}

public class TestTrace {
	public static void main(String[] args) {
		CallEg eg = new CallEg(); // use default constructor
		try {
			eg.methodA();
		} catch (ArithmeticException oops) {
			oops.printStackTrace();
		}
		
		//Kommentar: PrintStackTrace wird zweimal aufgerufen, da zweimal gecatched wird: In der main und in methodC, daher wird er zweimal ausgegeben.
	}
}