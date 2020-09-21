package com.alisson.workshopmongo.services.exeption;

public class ObjectNotFoundException extends NullPointerException{
	private static final long serialVersionUID = 1L;
	
	public ObjectNotFoundException(String msg) {
		super(msg);
	}
}
