package com.bjpowernode.javase.test002;
/*
 * 多态在实际开发中的作用：以主人喂养宠物为例
 * 1.分析
 * 		-主人【类】
 * 		-主人可以喂养宠物，有喂养宠物的动作
 * 		-宠物【类】
 * 		-宠物有吃东西的动作
 * 
 */
public class Test {
	
	public static void main(String args[]){
		
		//创建主人对象
		Master zhangsan = new Master();
		
		
		//创建猫对象
		Cat tom = new Cat();
		
		//创建小狗对象
		Dog erHa = new Dog();
		
		//主人喂养猫
		zhangsan.feed(tom);
		zhangsan.feed(erHa);
		
		zhangsan.feed(new Cat());
		zhangsan.feed(new Fish());
		
	}

}
