public class TestTrace {

	static class CallEg {
		public void methodA() throws ArithmeticException {
			//int a = 1 / 0; 
			try {
				methodB();
			} catch(Throwable e) {}
		}
		public void methodB() throws ArithmeticException {
			try {
				methodC();
			} catch(Throwable e) {}
		}
		public void methodC() throws ArithmeticException {
			try {
				int a = 1 / 0; 
			} catch (ArithmeticException e) {
				e.printStackTrace();
				throw e;
			}
		}
	}

	public static void main(String[] args) {
		CallEg eg = new CallEg(); // use default constructor
		try {
			eg.methodA();
		} catch (ArithmeticException oops) {
			oops.printStackTrace();
		}
	}
	
}