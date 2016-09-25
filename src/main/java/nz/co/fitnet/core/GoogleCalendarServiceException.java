package nz.co.fitnet.core;

public class GoogleCalendarServiceException extends Exception {

	private static final long serialVersionUID = 8998510921135730344L;

	public GoogleCalendarServiceException() {
		super();
	}

	public GoogleCalendarServiceException(final String message, final Throwable cause, final boolean enableSuppression,
			final boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public GoogleCalendarServiceException(final String message, final Throwable cause) {
		super(message, cause);
	}

	public GoogleCalendarServiceException(final String message) {
		super(message);
	}

	public GoogleCalendarServiceException(final Throwable cause) {
		super(cause);
	}
}
