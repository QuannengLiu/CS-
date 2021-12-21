package com.bjpowernote.javase.test003;
/*
 * 创建一个人的类
 */

public class Person {

	//定义私有属性姓名
	private String name;
	
	//定义私有属性性别
	private boolean sex;
	
	//定义私有属性age
	private int age;


	
	public static void main(String args[]){
				
		//创建人的类
		Person p = new Person();
		
		//给人的名字赋值
		p.setName("jack");
		
		//给人的年龄赋值
		p.setAge(16);
		
		//输出人的名字
		System.out.println(p.getName());
		
		//输出人的岁数
		System.out.println(p.getAge());
	
	}

	//为私有属性name创建set方法
	public void setName(String _name){
		
		name = _name;
		
	}
	
	//为私有属性name创建get方法
	public String getName(){
		
		return name;
		
	}
	
	
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		
		if (age < 0 || age > 100){
			
			//当人的年龄大于100岁或小于0岁时抛出异常，程序终止
			throw new RuntimeException("对不起，您输入的年龄不合法。");
			
		}

		//一般不这么输，不然就失去了封装的意义
		//System.out.println("年龄为：" + age);
		
		this.age = age;
		

	}

	/**
	 * @return the sex
	 */
	public boolean isSex() {
		return sex;
	}

	/**
	 * @param sex the sex to set
	 */
	public void setSex(boolean sex) {
		this.sex = sex;
	}

}
