public class OOTest07{

	public static void main(String[] args){

		//�����ʼǱ��������Բ���ֵ
		Laptop laptop = new Laptop();	
		laptop.brand = "lenovo";
		laptop.model = "superModel";
		laptop.color = "yellow";

		//����ѧ�����Բ���ֵ		
		Student02 xiaoMing = new Student02();
		xiaoMing.id = 2021;
		xiaoMing.name = "xiaoMing";

		//�����ʼǱ���������ѧ����֮��Ĺ�ϵ
		xiaoMing.l = laptop;
		
		//ͨ��ѧ���ҵ��ʼǱ����Ե�����
		System.out.println("С���ıʼǱ�����Ʒ���ǣ�" + xiaoMing.l.brand);
		System.out.println("С���ıʼǱ������ͺ��ǣ�" + xiaoMing.l.model);
		System.out.println("С���ıʼǱ�������ɫ�ǣ�" + xiaoMing.l.color);

	}
}