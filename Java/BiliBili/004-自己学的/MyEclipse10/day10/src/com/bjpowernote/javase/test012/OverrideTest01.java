package com.bjpowernote.javase.test012;

public class OverrideTest01 {
	
	public static void main(String args[]){
		
		Animal a = new Animal();
		a.move();
		
		Cat c = new Cat();
		c.move();
	}
	
}
