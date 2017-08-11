package plotTwist;

public class StoryException extends Exception {
	private static final long serialVersionUID = 1L;
	
	
	public StoryException() {
		super();
	}
	
	public StoryException(String string) {
		super(string);
	}
	
	
	public StoryException(Throwable cause) {
		super(cause);
	 }
	
	public StoryException(String message, Throwable cause){
		super(message, cause);
	}

	public StoryException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
	

	

}
