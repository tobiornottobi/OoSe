public class NumberTooSmallException extends Exception {

	NumberTooSmallException() {
		super();
	}

	NumberTooSmallException(String message) {
		super(message);
	}

	NumberTooSmallException(String message, Throwable cause) {
		super(message, cause);
	}
}