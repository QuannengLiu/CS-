/*
//��һ��д��
public class OperatorTest01{
	public static void main(String[] args){
		//�幫��֮���пϵ»�����ȥ�ϵ»��Է���
		double distance = 4.0;
		if (distance <= 5.0)
		{
			System.out.println("ȥ�Է�");//��λkm
		}else System.out.println("��ȥ�Է�");


	
	}
}


*/

/*
public class OperatorTest01{

	public static void main(String[] args){
	
	int score = -5;
	String grade = "�Բ���������ĳɼ����Ϸ���";
	
	if (score < 0 || score > 100)
	{
	}
	else if(score >= 90 )
		grade = "���ĵȼ�Ϊ��A��";
	else if(score >= 80 )
		grade = "���ĵȼ�Ϊ��B��";
	else if(score >= 70 )
		grade = "���ĵȼ�Ϊ��C��";
	else if(score >= 60 )
		grade = "���ĵȼ�Ϊ��D��";
	else grade = "���ĵȼ�Ϊ��E��";


	System.out.println(grade);
	}
}
*/

public class IfTest01{

	public static void main(String[] args){
	
	int score = 30;
	String grade = "�Բ���������ĳɼ����Ϸ���";
	
	if (score < 0 || score > 100)
	{
	}else if(score >= 90 ){
		grade = "���ĵȼ�Ϊ��A��";
	}else if(score >= 80 ){
		grade = "���ĵȼ�Ϊ��B��";
	}else if(score >= 70 ){
		grade = "���ĵȼ�Ϊ��C��";
	}else if(score >= 60 ){
		grade = "���ĵȼ�Ϊ��D��";
	}else grade = "���ĵȼ�Ϊ��E��";

	System.out.println(grade);
	}
}