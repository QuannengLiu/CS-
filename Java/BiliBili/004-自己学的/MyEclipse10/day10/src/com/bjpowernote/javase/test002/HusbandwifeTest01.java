package com.bjpowernote.javase.test002;
/*
 * 丈夫与妻子关联的程序；
 */
public class HusbandwifeTest01 {

	public static void main(String args[]){
		
		//创建Husband对象
		Husband jack = new Husband();
		
		//创建Wife对象
		Wife amy = new Wife();
		
		//给丈夫分配妻子
		jack.w = amy;
		
		//给妻子分配丈夫
		amy.h = jack;
		
		System.out.println(amy.h.birth);
		
	}
	
	
}




