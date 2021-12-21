package com.bjpowernote.javase.test004;

public class Customer {
	
	private String name;
	public Customer(){
	}
	public Customer(String _name){
	name = _name;
	}
	public void setName(String _name){
	name = _name;
	}
	public String getName(){
	return name;
	}
	public void shopping(){
	System.out.println("shopping() --> " + this);
	}

}
