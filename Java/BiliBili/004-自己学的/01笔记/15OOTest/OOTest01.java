public class OOTest01{

	public static void main(String[] args){

		//创建一个对象
		Student s = new Student();

		
		//访问一个对象
		System.out.println(s.no);
		System.out.println(s.sex);
		System.out.println(s.addr);
		System.out.println(s.name);
		System.out.println("----------------------------------------");


		s.no = 2021;
		s.sex = true;
		s.addr = "重庆市沙坪坝区";
		s.name = "张三";

		System.out.println(s.no);
		System.out.println(s.sex);
		System.out.println(s.addr);
		System.out.println(s.name);

	}

}