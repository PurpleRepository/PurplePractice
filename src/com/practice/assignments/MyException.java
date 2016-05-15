package com.practice.assignments;
public class MyException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4108933263845051828L;
	String message;
	
	public MyException(){
		
	}
	
	@Override
    public String toString() {
        return message;
    }

    @Override
    public String getMessage() {
        return message;
    }

	public void setMessage(String message) {
		this.message = message;
	}

	public MyException(String message) {
		super(message);
		this.message = message;
	}
	
	public MyException (Throwable cause) {
		super(cause);
	}
	
	public MyException (String message, Throwable cause) {
		super(message, cause);
		this.message = message;
	}
}
