public class SwitchTest05
{

	public static void main(String[] args){
	//��ӭ
	java.util.Scanner s = new java.util.Scanner(System.in);
	System.out.println("��ӭʹ�ñ�ϵͳ����ϵͳ���ڲ�ѯ�����ɼ��ȼ���");
	//����ɼ�
	System.out.print("���������ĳɼ���");
	double score = s.nextDouble();
	//����ɼ��ȼ�
	int grade = (int)(score/10);
	//switch����жϳɼ�����
	switch (grade)
	{
	case 9 :case 10 :
			System.out.println("���ļ���ΪA");
			break;

	case 8 :
			System.out.println("���ļ���ΪB");
			break;

	case 7 :
			System.out.println("���ļ���ΪC");
			break;

	case 6 :
			System.out.println("���ļ���ΪD");
			break;
	
	case 5 :case 4 :case 3 :case 2 :case 1 :case 0 :
			System.out.println("���ļ���ΪE");
			break;
	
	default :
			System.out.println("�Բ������������ֵ���Ϸ���");
			break;	
	}
	}
}