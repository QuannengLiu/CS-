public class P225{

	public static void main(String[] args){

		init();

	}
/*
	public static String name(String name){

		if (name == "admin")
		{
			return "��ϲ������½�ɹ���";
		}
		else{

			return "�Բ����½ʧ�ܣ�";

		}
	
	}

	public static String password(String password){

		if (password == "123")
		{
			return "��ϲ������½�ɹ���";
		}
		else{

			return "�Բ����½ʧ�ܣ�";
		}
	
	}
*/
	public static void init(){

		System.out.println("��ӭ������ʼ����¼ҳ�棬�����������û��������롣");
		System.out.print("�����������û�����");
		java.util.Scanner s=new java.util.Scanner(System.in);
		String nameTest = s.next();

		java.util.Scanner j=new java.util.Scanner(System.in);
		System.out.print("�������������룺");
		int passwordTest = j.nextInt();

		/*������û��
		System.out.println(nameTest);
		System.out.println(passwordTest);
		*/


		//�ж����û��
		//һֱ����ԭ��Java������ж������ַ����Ƿ���ȵķ���������
		/*
		������һ��ʾ�����룺


		String a1 = "abc";
		String b1 = "abc";

		// ʹ�� == �ж����ʱ��ָ��ͬ���ڴ��ַ��Ҳ����ͬһ������ʵ����
		System.out.println(a1 == b1); // true

		String a2 = new String("abc");
		String b2 = new String("abc");

		System.out.println(a2 == b2); // false ��Ϊ a �� b ָ��ͬ����

		// equals �����жϵ�����ڲ�ͬ�Ķ�����ʵ�ֲ�ͬ������Ҳ��ͬ��
		System.out.println(a2.equals(b2)); // true

		*/


		if (nameTest.equals("admin") & passwordTest == 123){
			System.out.println("��ϲ������½�ɹ���");
		}else{
			System.out.println("�Բ��𣬵�½ʧ�ܣ�");
		}

/*
		if (nameTest.equals("admin")){
			System.out.println("��ϲ������½�ɹ���");
		}else{
			System.out.println("�Բ��𣬵�½ʧ�ܣ�");
		}

		if (passwordTest == 123){
			System.out.println("��ϲ������½�ɹ���");
		}else{
			System.out.println("�Բ��𣬵�½ʧ�ܣ�");
		}

*/
	}






}