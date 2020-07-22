package com.ordermanagement.util;

@SuppressWarnings("serial")
public class OrderNotFoundException extends RuntimeException{
	
	public OrderNotFoundException(String msg){
		super(msg);
	}

}
