package com.example.demo.exception;

public class StockPublishingException extends RuntimeException {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public StockPublishingException(String message) {
        super(message);
    }
}
