public class OOTest01{

	public static void main(String[] args){

		//����һ������
		Student s = new Student();

		
		//����һ������
		System.out.println(s.no);
		System.out.println(s.sex);
		System.out.println(s.addr);
		System.out.println(s.name);
		System.out.println("----------------------------------------");


		s.no = 2021;
		s.sex = true;
		s.addr = "������ɳƺ����";
		s.name = "����";

		System.out.println(s.no);
		System.out.println(s.sex);
		System.out.println(s.addr);
		System.out.println(s.name);

	}

}