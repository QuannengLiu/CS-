/*
public class IfTest03
{
	public static void main(String[] args){
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.println("���ã���ӭ��ʹ�ô�ϵͳ");
		System.out.println("��������һЩ��Ϣ����Ҫ��ʶ̧��");
		System.out.println("0��ʾ���죬1��ʾ����");
		int weather = s.nextInt();
		System.out.println("��������һЩ��Ϣ����Ҫ��ʶ̧��");
		System.out.println("0��ʾŮ��1��ʾ��");
		int sex = s.nextInt();
		if (weather == 0)
		{
			System.out.println("�������뵱ǰ�¶ȣ���Ҫ��ʶ̧��");
			int Temperture = s.nextInt();
			if (Temperture > 30)
			{
				if (sex == 0)
				{
					System.out.println("����ɹ˪");
				}
				else
				{
					System.out.println("���۾�");
				}

			}else{
				System.out.println("ʲôҲ����");

			}

		}else{
			if (sex == 0)
				{
					System.out.println("��һ��С��ɡ");
				}
				else
				{
					System.out.println("��һ�Ѵ��ɡ");
				}

		
		}
	}
}
*/



/*
���� Ů ����һ��С��ɡ��
���� �� ����һ�Ѵ��ɡ��
���� �¶ȸ���30���϶� Ů ������ɹ˪��
���� �¶ȸ���30���϶� �� ����ī����
���� �¶ȵ���30���϶� Ů ��ʲôҲ������
���� �¶ȵ���30���϶� �� ��ʲôҲ������
*/
public class IfTest03{
	public static void main(String[] args){
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.println("���ã���ӭ��ʹ�ô�ϵͳ");
		System.out.println("��������һЩ��Ϣ����Ҫ��ʶ̧��");
		System.out.println("0��ʾ���죬1��ʾ����");
		int weather = s.nextInt();
		System.out.println("��������һЩ��Ϣ����Ҫ��ʶ̧��");
		System.out.println("0��ʾŮ��1��ʾ��");
		int sex = s.nextInt();
		if (weather == 0){//����
			System.out.println("�������뵱ǰ�¶ȣ���Ҫ��ʶ̧��");
			//��������
			int Temperture = s.nextInt();
			if (Temperture > 30){//����
				if (sex == 0){//Ů�����������ʲô
					System.out.println("����ɹ˪");
				}else{//�������������ʲô
					System.out.println("���۾�");
					}
			}else{//���������ʲô
				System.out.println("ʲôҲ����");
				}
		}else{//����
			if (sex == 0){
				System.out.println("��һ��С��ɡ");
				}
			else{
				System.out.println("��һ�Ѵ��ɡ");
				}
			}
	}
}