public class OOTest02{

	public static void main(String[] args){

		//����һ���ɷ��࣬�������ɷ������Ϊ������
		Husband huangXiaoMing = new Husband();
		huangXiaoMing.name = "������";

		//����һ�������࣬���������ӵ�����Ϊ��ӱ
		Wife baby = new Wife();
		baby.name = "��ӱ";

		//��顾����ͨ���������ҵ�baby��ͨ��baby�ҵ���������
		huangXiaoMing.w = baby;
		baby.h = huangXiaoMing;

		//�õ����������ӵ�����
		//ͨ�����ӷ���
		System.out.println( "���������ӵ������ǣ�" + baby.name);
		//ͨ������������
		System.out.println( "���������ӵ������ǣ�" + huangXiaoMing.w.name);

		//�õ�baby�ɷ������
		//ͨ���ɷ����
		System.out.println( "baby�ɷ�������ǣ�" + huangXiaoMing.name);
		//ͨ����ӱ����
		System.out.println( "baby�ɷ�������ǣ�" + baby.h.name);
	}
}