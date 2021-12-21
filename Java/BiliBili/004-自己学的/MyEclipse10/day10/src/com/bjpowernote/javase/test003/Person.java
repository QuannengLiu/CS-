package com.bjpowernote.javase.test003;
/*
 * ����һ���˵���
 */

public class Person {

	//����˽����������
	private String name;
	
	//����˽�������Ա�
	private boolean sex;
	
	//����˽������age
	private int age;


	
	public static void main(String args[]){
				
		//�����˵���
		Person p = new Person();
		
		//���˵����ָ�ֵ
		p.setName("jack");
		
		//���˵����丳ֵ
		p.setAge(16);
		
		//����˵�����
		System.out.println(p.getName());
		
		//����˵�����
		System.out.println(p.getAge());
	
	}

	//Ϊ˽������name����set����
	public void setName(String _name){
		
		name = _name;
		
	}
	
	//Ϊ˽������name����get����
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
			
			//���˵��������100���С��0��ʱ�׳��쳣��������ֹ
			throw new RuntimeException("�Բ�������������䲻�Ϸ���");
			
		}

		//һ�㲻��ô�䣬��Ȼ��ʧȥ�˷�װ������
		//System.out.println("����Ϊ��" + age);
		
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
