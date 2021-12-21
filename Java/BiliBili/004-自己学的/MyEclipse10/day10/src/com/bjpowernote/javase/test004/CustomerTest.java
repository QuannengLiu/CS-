package com.bjpowernote.javase.test004;

public class CustomerTest {

	public static void main(String[] args) {
		Customer jack = new Customer("jack");
		System.out.println("main() ---> " + jack);
		jack.shopping();
		
		System.out.println("====================");
		Customer rose = new Customer("rose");
		System.out.println("main() ---> " + rose);
		rose.shopping();

	}
}
