public class NumberTooBigException extends RuntimeException {

	NumberTooBigException() {
		super();
	}

	NumberTooBigException(String message) {
		super(message);
	}

	NumberTooBigException(String message, Throwable cause) {
		super(message, cause);
	}
}