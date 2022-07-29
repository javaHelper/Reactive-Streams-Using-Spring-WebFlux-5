package com.example.demo.exception;

public class StockCreationException extends RuntimeException {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public StockCreationException(String message) {
        super(message);
    }
}
