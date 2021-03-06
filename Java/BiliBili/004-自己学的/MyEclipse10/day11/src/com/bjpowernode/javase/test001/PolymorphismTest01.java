package com.bjpowernode.javase.test001;

public class PolymorphismTest01 {
	
	public static void main(String args[]){
		
		//向上转换，自动转换，把cat类型转换成Animal类型
		Animal a2 = new Cat();
		
		a2.move();
		
		/*在编译期时a2时Animal类型，没有抓老鼠，需要进行向下强制类型转换
		 * 
		a2.catchMouse();*/
		
		Cat c2 = (Cat) a2;
		
		c2.catchMouse();

		/**
		 * 1.以下程序编译没有问题，因为编译器检查到a3的类型是Animal，
		 * Animal和Cat之间存在继承关系，并且Animal是父类，Cat是子类，
		 * 父类型向下转型成子类型，语法不存在问题。
		 * 
		 * 2.程序虽然编译通过，但是程序在运行阶段会出异常，因为此时JVM堆内存
		 * 当中真实存在的对象是Bird类，Bird对象和Cat对象之间无法进行类型转换，
		 * 因为二者之间不存在任何继承关系，此时出现著名的异常：
		 *			 java.lang.ClassCastException
		 * 			类型转换异常，这种异常总是在“向下转型”中出现。
		 */
		
//		Animal a3 = new Bird();
//		Cat c3 = (Cat) a3;
//		a3.move();

		
		/* 3.怎样避免向下转型的异常
		 * 			使用instanceof运算符可以避免。
		 * 
		 * 4.instanceof运算符怎么用？
		 * 
		 * 				4.1.语法格式：
		 * 						(引用 instanceof 数据类型)
		 * 
		 * 				4.2.	以上运算符的执行结果是布尔类型，结果可能是：true/false
		 * 
		 * 				4.3.关于运算符结果true/false：
		 * 							假设(a instanceof Animal)
		 * 							true表示：
		 * 									a引用指向的这个对象是Animal类型
		 * 							false表示：
		 * 									a引用指向的这个对象不是Animal类型
		 * 5.java规范：
		 * 			在进行强制类型转换时，建议采用instanceof运算符进行判断，避免类型转换异常的出现，这是一种编程好习惯
		 */
		
		Animal a3 = new Cat();
		if (a3 instanceof Cat){
			
			Cat c3 = (Cat) a3;
			c3.catchMouse();
			
		}else {
			
			Bird c3 = (Bird) a3;
			c3.fly();
		};
		
		int i = 10;
		int j = 20;
		int retVaule = sumInt(i, j);
		
		System.out.println(retVaule);
	}

	private static int sumInt(int i, int j) {
		// TODO Auto-generated method stub
		return i + j;
	}


}
