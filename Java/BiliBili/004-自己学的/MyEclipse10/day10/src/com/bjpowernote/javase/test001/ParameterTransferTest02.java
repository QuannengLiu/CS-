package com.bjpowernote.javase.test001;

public class ParameterTransferTest02 {

	public static void main(String[] args) {
		User user = new User(20);
		add(user);
		System.out.println("main's user age = " + user.age);
		}
		public static void add(User user) {
		user.age++;
		System.out.println("add's user age = " + user.age);
	}
}

class User{
	int age;
	public User(){}
	public User(int _age){
	age = _age;
	}
}
