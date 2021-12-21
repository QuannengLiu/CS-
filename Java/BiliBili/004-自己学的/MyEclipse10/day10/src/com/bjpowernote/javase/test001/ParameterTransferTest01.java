package com.bjpowernote.javase.test001;

public class ParameterTransferTest01 {
	public static void main(String[] args) {
		int i = 10;
		add(i);
		System.out.println("main's i = " + i);
	}
	public static void add(int i){
		i++;
		System.out.println("add's i = " + i);
	}
}
